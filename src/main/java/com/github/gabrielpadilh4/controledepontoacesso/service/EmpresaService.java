package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Empresa;
import com.github.gabrielpadilh4.controledepontoacesso.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IServiceCrud<Empresa> {

    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa update(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @Override
    public Optional<Empresa> findById(long id) {
        return empresaRepository.findById(id);
    }

    @Override
    public void delete(Empresa empresa) {
        empresaRepository.delete(empresa);
    }

    @Override
    public void deleteById(long id) {
        empresaRepository.deleteById(id);
    }
}
