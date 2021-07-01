package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, BancoHoras.BancoHorasId> {
    @Query("SELECT b FROM BancoHoras b WHERE b.id.idBancoHoras = ?1")
    Optional<BancoHoras> findByMIdBancoHoras(long idBancoHoras);

    @Modifying
    @Transactional
    @Query("DELETE FROM BancoHoras b WHERE b.id.idBancoHoras = ?1")
    void deleteByMIdBancoHoras(long idBancoHoras);
}
