package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Movimentacao.MovimentacaoId> {
    @Query("SELECT m FROM Movimentacao m WHERE m.id.idMovimento = ?1")
    Optional<Movimentacao> findByMIdMovimento(long idMovimentacao);

    @Modifying
    @Transactional
    @Query("DELETE FROM Movimentacao m WHERE m.id.idMovimento = ?1")
    void deleteByMIdMovimento(long idMovimentacao);
}
