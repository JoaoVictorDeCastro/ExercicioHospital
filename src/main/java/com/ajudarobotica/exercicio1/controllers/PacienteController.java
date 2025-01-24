package com.ajudarobotica.exercicio1.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.Paciente;
import com.ajudarobotica.exercicio1.database.PacienteRepository;
import com.google.gson.Gson;

@RestController
public class PacienteController {
    Gson gson = new Gson();
    PacienteRepository pacienteRepository = new PacienteRepository();

    @GetMapping("/pacientes")
    public String getPacientes() {
        List<Paciente> response = pacienteRepository.getAll();
        return gson.toJson(response);
    }

    @PostMapping("/pacientes")
    public void insertPacientes(@RequestBody Paciente paciente) {
        pacienteRepository.insert(paciente);
    }
}
