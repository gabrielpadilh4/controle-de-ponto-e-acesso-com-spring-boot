package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
