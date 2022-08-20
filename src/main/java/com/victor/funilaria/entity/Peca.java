package com.victor.funilaria.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Peca {
    @Id
    @SequenceGenerator(name = "funilaria_id_seq", sequenceName = "funilaria_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funilaria_id_seq")
    private Long id;
    @Column
    private String nome;
    @Column(precision = 9, scale = 2)
    private BigDecimal precoVenda;
    @Column(precision = 9, scale = 2)
    private BigDecimal precoCompra;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }


    public void setId(Long id) {
        this.id = id;
    }
}
