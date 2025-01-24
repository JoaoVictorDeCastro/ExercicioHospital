package com.ajudarobotica.exercicio1;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;

    Pessoa() {

    }

    Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    String getNome() {
        return this.nome;
    }

    String getCpf() {
        return this.cpf;
    }

    String getDataNascimento() {
        return this.dataNascimento;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void getDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}



