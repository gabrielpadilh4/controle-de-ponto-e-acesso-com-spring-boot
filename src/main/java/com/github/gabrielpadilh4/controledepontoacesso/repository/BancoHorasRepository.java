package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}
