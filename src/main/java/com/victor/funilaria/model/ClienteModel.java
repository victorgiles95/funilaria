package com.victor.funilaria.model;

import javax.persistence.*;

public class ClienteModel {
    private Long Id;

    private String Nome;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
