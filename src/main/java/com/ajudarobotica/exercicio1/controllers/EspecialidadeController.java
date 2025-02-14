package com.ajudarobotica.exercicio1.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.model.Especialidade;
import com.ajudarobotica.exercicio1.service.EspecialidadeService;

@RestController
public class EspecialidadeController {
    EspecialidadeService especialidadeService;

    public EspecialidadeController(EspecialidadeService especialidadeService) {
        this.especialidadeService = especialidadeService;
    }

    @GetMapping("/especialidades")
    public List<Especialidade> getEspecilidades() {
        return especialidadeService.getAll();
    }

    @PostMapping("/especialidades")
    public void insertEspecialidades(@RequestBody Especialidade especialidade) {
        especialidadeService.save(especialidade);
    }
}
