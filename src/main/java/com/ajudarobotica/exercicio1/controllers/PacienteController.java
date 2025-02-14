package com.ajudarobotica.exercicio1.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.model.Paciente;
import com.ajudarobotica.exercicio1.service.PacienteService;

@RestController
public class PacienteController {
    PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes() {
        return pacienteService.getAll();
    }

    @PostMapping("/pacientes")
    public void insertPacientes(@RequestBody Paciente paciente) {
        pacienteService.save(paciente);
    }
}
