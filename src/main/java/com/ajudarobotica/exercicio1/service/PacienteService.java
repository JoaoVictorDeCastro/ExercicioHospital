package com.ajudarobotica.exercicio1.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.exercicio1.model.Paciente;
import com.ajudarobotica.exercicio1.repository.PacienteRepository;

@Service
public class PacienteService {
    PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> getAll() {
        return pacienteRepository.findAll();
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
