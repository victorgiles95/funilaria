package com.victor.funilaria.entity;

import javax.persistence.*;

    @Entity
    public class Cliente {
        @Id
        @SequenceGenerator(name = "cliente_id_seq", sequenceName = "cliente_id_seq", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
        private Long id;
        @Column
        private String nome;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

