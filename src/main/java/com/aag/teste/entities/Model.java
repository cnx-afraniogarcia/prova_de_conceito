package com.aag.teste.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@MappedSuperclass
@EqualsAndHashCode
public class Model implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
}
