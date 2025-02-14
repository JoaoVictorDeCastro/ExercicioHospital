package com.ajudarobotica.exercicio1.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ajudarobotica.exercicio1.model.Consulta;
import com.ajudarobotica.exercicio1.service.ConsultaService;

@RestController
public class ConsultaController {
    ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @GetMapping("/consultas")
    public List<Consulta> getConsultas() {
        return consultaService.getAll();
    }

    @PostMapping("/consultas")
    public void insertConsultas(@RequestBody Consulta consulta) {
        consultaService.save(consulta);
    }
}
