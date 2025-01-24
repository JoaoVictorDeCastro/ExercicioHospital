package com.ajudarobotica.exercicio1;

public class Especialidade {
    private String nome;
    private String descricao;

    Especialidade() {

    }

    Especialidade(String nome, String descricao) {
        setNome(nome);
        setDescricao(descricao);
    }

    String getNome() {
        return this.nome;
    }

    String getDescricao() {
        return this.descricao;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
