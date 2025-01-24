package com.ajudarobotica.exercicio1;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String horario;

    Consulta() {

    }

    Consulta(Paciente paciente, Medico medico, String horario) {
        setPaciente(paciente);
        setMedico(medico);
        setHorario(horario);
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

    Paciente getPaciente() {
        return this.paciente;
    }

    Medico getMedico() {
        return this.medico;
    }

    String getHorario() {
        return this.horario;
    }
}
