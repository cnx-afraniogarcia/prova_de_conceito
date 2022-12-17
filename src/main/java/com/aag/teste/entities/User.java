package com.aag.teste.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class User extends Model implements Serializable {

    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false)
    private Integer idade;
    @Column(nullable = false, length = 14)
    private String cpf;
    @Column(nullable = false, length = 50)
    private String email;

    /**
     * COLOCAR ENCRIPTADOR USADO NA CONEXA
     */
    @Column(nullable = false, length = 30)
    private String senha;
}
