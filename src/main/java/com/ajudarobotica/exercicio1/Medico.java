package com.ajudarobotica.exercicio1;

public class Medico extends Pessoa implements IPessoa {

    private Especialidade especialidade;

    Medico() {

    }

    Medico(String nome, String cpf, String dataNascimento, Especialidade especialidade) {
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEspecialidade(especialidade);
    }

    void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    Especialidade getEspecialidade(Especialidade especialidade) {
        return this.especialidade;
    }

    @Override
    public void informacoes() {
        getNome();
        getCpf();
        getDataNascimento();
        getEspecialidade(especialidade);
    }
    
}
