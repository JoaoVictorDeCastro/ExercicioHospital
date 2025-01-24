package com.ajudarobotica.exercicio1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.Medico;
import com.ajudarobotica.exercicio1.database.MedicoRepository;
import com.google.gson.Gson;

@RestController
public class MedicoController {
    Gson gson = new Gson();
    MedicoRepository medicoRepository = new MedicoRepository();

    @GetMapping("/medicos")
    public String getMedicos() {
        List<Medico> response = medicoRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/medicos")
    public void insertMedicos(@RequestBody Medico medico) {
        medicoRepository.insert(medico);
    }
}
