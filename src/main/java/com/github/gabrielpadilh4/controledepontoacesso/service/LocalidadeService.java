package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Localidade;
import com.github.gabrielpadilh4.controledepontoacesso.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService implements IServiceCrud<Localidade> {

    @Autowired
    LocalidadeRepository localidadeRepository;

    @Override
    public Localidade save(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    @Override
    public Localidade update(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    @Override
    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    @Override
    public Optional<Localidade> findById(long id) {
        return localidadeRepository.findById(id);
    }

    @Override
    public void delete(Localidade localidade) {
        localidadeRepository.delete(localidade);
    }

    @Override
    public void deleteById(long id) {
        localidadeRepository.deleteById(id);
    }
}
