package com.aag.teste.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarMensagem(String fila, Object mensagem) {
        this.rabbitTemplate.convertAndSend(fila, mensagem);
    }

}
