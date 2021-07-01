package com.github.gabrielpadilh4.controledepontoacesso.repository;

import com.github.gabrielpadilh4.controledepontoacesso.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
