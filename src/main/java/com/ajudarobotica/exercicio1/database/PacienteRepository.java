package com.ajudarobotica.exercicio1.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.exercicio1.Paciente;

public class PacienteRepository {
    List<Paciente> pacientes = new ArrayList<>();

    public void insert (Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> getAll() {
        return pacientes;
    }
}
