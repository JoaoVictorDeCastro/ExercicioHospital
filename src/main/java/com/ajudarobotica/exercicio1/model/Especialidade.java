package com.ajudarobotica.exercicio1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Especialidade {
    private String nome;
    private String descricao;
    @Id
    private String id;

    Especialidade() {

    }

    Especialidade(String nome, String descricao, String id) {
        this.descricao = descricao;
        this.nome = nome;
        this.id = id;
    }

    String getNome() {
        return this.nome;
    }

    String getDescricao() {
        return this.descricao;
    }

    String getId() {
        return this.id;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    void setId(String id) {
        this.id = id;
    }
}
