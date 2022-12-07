package com.aag.teste.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Model implements Serializable {
    private static final long serialVersionUID = 1l;

    private String nome;
}
