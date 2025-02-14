package com.ajudarobotica.exercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajudarobotica.exercicio1.model.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, String> {

}
