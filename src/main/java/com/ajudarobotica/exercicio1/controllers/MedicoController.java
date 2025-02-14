package com.ajudarobotica.exercicio1.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.model.Medico;
import com.ajudarobotica.exercicio1.service.MedicoService;

@RestController
public class MedicoController {
    MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping("/medicos")
    public List<Medico> getMedicos() {
        return medicoService.getAll();
    }

    @PostMapping("/medicos")
    public void insertMedicos(@RequestBody Medico medico) {
        medicoService.save(medico);
    }
}
