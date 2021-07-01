package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}
