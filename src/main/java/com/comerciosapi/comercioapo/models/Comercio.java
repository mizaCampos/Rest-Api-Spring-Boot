package com.comerciosapi.comercioapo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String nome;
    
    @Column(nullable = false, unique = true, length = 14)
    private String telefone;

    @Column(nullable = false)
    private String endereco;

    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String categoria;

}
