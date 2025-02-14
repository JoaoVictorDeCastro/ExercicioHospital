package com.ajudarobotica.exercicio1.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ajudarobotica.exercicio1.model.Consulta;
import com.ajudarobotica.exercicio1.repository.ConsultaRepository;

@Service
public class ConsultaService {
    ConsultaRepository consultaRepository;

    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public List<Consulta> getAll() {
        return consultaRepository.findAll();
    }

    public Consulta save(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
}
