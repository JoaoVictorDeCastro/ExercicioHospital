package com.ajudarobotica.exercicio1.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.exercicio1.Especialidade;

public class EspecialidadeRepository {
    List<Especialidade> especialidades = new ArrayList<>();

    public void insert(Especialidade especialidade) {
        especialidades.add(especialidade);
    }

    public List<Especialidade> getAll() {
        return especialidades;
    }
}
