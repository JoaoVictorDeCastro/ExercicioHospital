package com.ajudarobotica.exercicio1.model;

import com.ajudarobotica.exercicio1.IPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Medico implements IPessoa {

    private String nome;
    @Id
    private String cpf;
    private String dataNascimento;
    @OneToOne
    private Especialidade especialidade;

    Medico() {

    }

    Medico(String nome, String cpf, String dataNascimento, Especialidade especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.especialidade = especialidade;
    }

    void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    Especialidade getEspecialidade() {
        return this.especialidade;
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

    @Override
    public void informacoes() {

    }
    
}
