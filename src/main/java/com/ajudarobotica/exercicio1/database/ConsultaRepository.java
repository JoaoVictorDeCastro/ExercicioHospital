package com.ajudarobotica.exercicio1.database;

import java.util.ArrayList;
import java.util.List;
import com.ajudarobotica.exercicio1.Consulta;

public class ConsultaRepository {
        List<Consulta> consultas = new ArrayList<>();

    public void insert(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getAll() {
        return consultas; 
    }

}
