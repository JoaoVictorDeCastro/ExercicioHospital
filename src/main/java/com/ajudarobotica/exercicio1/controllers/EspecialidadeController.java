package com.ajudarobotica.exercicio1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.Especialidade;
import com.ajudarobotica.exercicio1.database.EspecialidadeRepository;
import com.google.gson.Gson;

@RestController
public class EspecialidadeController {
    Gson gson = new Gson();
    EspecialidadeRepository especialidadeRepository = new EspecialidadeRepository();

    @GetMapping("/especialidades")
    public String getEspecilidades() {
        List<Especialidade> response = especialidadeRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/especialidades")
    public void insertEspecialidades(@RequestBody Especialidade especialidade) {
        especialidadeRepository.insert(especialidade);
    }
}
