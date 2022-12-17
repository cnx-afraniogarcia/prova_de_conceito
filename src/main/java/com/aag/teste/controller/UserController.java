package com.aag.teste.controller;

import com.aag.teste.dto.UserDTO;
import com.aag.teste.services.UserSerive;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserSerive userSerive;

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO) {
        logger.info("Controller: Salvando usuário {}", userDTO.getEmail());
        userSerive.save(userDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getId(@PathVariable Long id) {
        UserDTO dto = userSerive.getId(id);
        return ResponseEntity.ok().body(dto);
    }
}
