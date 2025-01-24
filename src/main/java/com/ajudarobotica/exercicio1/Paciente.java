package com.ajudarobotica.exercicio1;

public class Paciente extends Pessoa implements IPessoa{

    Paciente() {

    }

    Paciente(String nome, String cpf, String dataNascimento) {
        setNome(nome);
        setCpf(cpf); 
        setDataNascimento(dataNascimento);
    }

    @Override
    public String informacoes() {
       return " ";
    }
    
}
