package com.ajudarobotica.exercicio1.model;

import com.ajudarobotica.exercicio1.IPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paciente implements IPessoa{

    private String nome;
    @Id
    private String cpf;
    private String dataNascimento;

    Paciente() {

    }

    Paciente(String nome, String cpf, String dataNascimento) {
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

    void setDataNascimento (String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void informacoes() {

    }
    
}
