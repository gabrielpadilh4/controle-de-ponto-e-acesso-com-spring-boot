package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Ocorrencia;
import com.github.gabrielpadilh4.controledepontoacesso.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService implements IServiceCrud<Ocorrencia> {

    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    @Override
    public Ocorrencia save(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    @Override
    public Ocorrencia update(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    @Override
    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    @Override
    public Optional<Ocorrencia> findById(long id) {
        return ocorrenciaRepository.findById(id);
    }

    @Override
    public void delete(Ocorrencia ocorrencia) {
        ocorrenciaRepository.delete(ocorrencia);
    }

    @Override
    public void deleteById(long id) {
        ocorrenciaRepository.deleteById(id);
    }
}
