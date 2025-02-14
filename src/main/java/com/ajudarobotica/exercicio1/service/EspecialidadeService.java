package com.ajudarobotica.exercicio1.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.exercicio1.model.Especialidade;
import com.ajudarobotica.exercicio1.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {
    EspecialidadeRepository especialidadeRepository;

    public EspecialidadeService(EspecialidadeRepository especialidadeRepository) {
        this.especialidadeRepository = especialidadeRepository;
    }

    public List<Especialidade> getAll() {
        return especialidadeRepository.findAll();
    }

    public Especialidade save(Especialidade especialidade) {
        return especialidadeRepository.save(especialidade);
    }
}
