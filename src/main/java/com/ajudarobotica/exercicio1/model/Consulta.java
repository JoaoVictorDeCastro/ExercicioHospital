package com.ajudarobotica.exercicio1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String horario;
    @Id
    private String id;

    Consulta() {

    }

    Consulta(Paciente paciente, Medico medico, String horario, String id) {
        this.paciente = paciente;
        this.horario =  horario;
        this.medico = medico;
        this.id = id;
    }

    void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    void setMedico(Medico medico) {
        this.medico = medico;
    }

    void setHorario (String horario) {
        this.horario = horario;
    }

    void setId(String id) {
        this.id = id;
    }

    Paciente getPaciente() {
        return this.paciente;
    }

    Medico getMedico() {
        return this.medico;
    }

    String getHorario() {
        return this.horario;
    }

    String getId() {
        return this.id;
    }
}
