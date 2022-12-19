package com.aag.teste.controller;

import com.aag.teste.services.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rabbit/mensagens")
public class RabbitmqController {

    @Autowired
    private RabbitmqService rabbitmqService;

    @PutMapping
    private ResponseEntity enviaMensagem(@RequestParam String mensagem) {
        rabbitmqService.enviarMensagem("mensagem", mensagem);
        return new ResponseEntity(HttpStatus.OK);
    }
}
