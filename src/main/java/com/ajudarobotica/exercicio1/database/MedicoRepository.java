package com.ajudarobotica.exercicio1.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.exercicio1.Medico;

public class MedicoRepository {
    List<Medico> medicos = new ArrayList<>();

    public void insert(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> getAll() {
        return medicos;
    }
}
