package com.vitor.desafio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public Bloco(){
    }

    public Bloco(Integer id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }
}
