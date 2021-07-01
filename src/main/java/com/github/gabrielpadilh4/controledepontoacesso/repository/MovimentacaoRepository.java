package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
