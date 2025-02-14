package com.ajudarobotica.exercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajudarobotica.exercicio1.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, String> {

}
