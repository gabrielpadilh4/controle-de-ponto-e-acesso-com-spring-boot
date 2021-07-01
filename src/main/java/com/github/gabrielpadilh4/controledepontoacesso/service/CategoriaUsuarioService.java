package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.CategoriaUsuario;
import com.github.gabrielpadilh4.controledepontoacesso.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService implements IServiceCrud<CategoriaUsuario> {

    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Override
    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    @Override
    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    @Override
    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    @Override
    public Optional<CategoriaUsuario> findById(long id) {
        return categoriaUsuarioRepository.findById(id);
    }

    @Override
    public void delete(CategoriaUsuario categoriaUsuario) {
        categoriaUsuarioRepository.delete(categoriaUsuario);
    }

    @Override
    public void deleteById(long id) {
        categoriaUsuarioRepository.deleteById(id);
    }
}
