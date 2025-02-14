package com.ajudarobotica.exercicio1.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.exercicio1.model.Medico;
import com.ajudarobotica.exercicio1.repository.MedicoRepository;

@Service
public class MedicoService {
    MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> getAll() {
        return medicoRepository.findAll();
    }

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }
}
