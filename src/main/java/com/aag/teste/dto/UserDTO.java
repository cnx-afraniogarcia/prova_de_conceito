package com.aag.teste.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    /**
     * CRIAR AS PRÓPRIAS ANOTAÇÕES
     */
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;
    private String senha;
}
