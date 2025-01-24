package com.ajudarobotica.exercicio1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.Consulta;
import com.ajudarobotica.exercicio1.database.ConsultaRepository;
import com.google.gson.Gson;

@RestController
public class ConsultaController {
    Gson gson = new Gson();
    ConsultaRepository consultaRepository = new ConsultaRepository();

    @GetMapping("/consultas")
    public String getConsultas() {
        List<Consulta> response = consultaRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/consultas")
    public void insertConsultas(@RequestBody Consulta consulta) {
        consultaRepository.insert(consulta);
    }
}
