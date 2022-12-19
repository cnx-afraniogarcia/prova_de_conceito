package com.aag.teste.conection;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RabbitmqConection {
    private static final String NOME_EXCHANGE = "user";
    private static final String MENSAGEM_FILA = "mensagem";

    private AmqpAdmin amqpAdmin;

    public RabbitmqConection(AmqpAdmin amqpAdmin) {
        this.amqpAdmin = amqpAdmin;
    }

    private Queue fila(String filaNome) {
        return new Queue(filaNome, true, false, false);
    }

    private DirectExchange trocaDireta() {
        return new DirectExchange(NOME_EXCHANGE);
    }

    private Binding relacionamento(Queue fila, DirectExchange exchange) {
        return new Binding(fila.getName(), Binding.DestinationType.QUEUE, exchange.getName(), fila.getName(), null);
    }

    @PostConstruct
    private void adiciona() {
        Queue filaObjeto = this.fila(MENSAGEM_FILA);
        DirectExchange troca = this.trocaDireta();
        Binding ligacao = this.relacionamento(filaObjeto, troca);


        this.amqpAdmin.declareQueue(filaObjeto);
        this.amqpAdmin.declareExchange(troca);
        this.amqpAdmin.declareBinding(ligacao);
    }
}
