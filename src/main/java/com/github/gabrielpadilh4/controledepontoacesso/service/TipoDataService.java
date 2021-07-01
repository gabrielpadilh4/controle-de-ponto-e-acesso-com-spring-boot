package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.TipoData;
import com.github.gabrielpadilh4.controledepontoacesso.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService implements IServiceCrud<TipoData> {

    @Autowired
    TipoDataRepository tipoDataRepository;

    @Override
    public TipoData save(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    @Override
    public TipoData update(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    @Override
    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    @Override
    public Optional<TipoData> findById(long id) {
        return tipoDataRepository.findById(id);
    }

    @Override
    public void delete(TipoData tipoData) {
        tipoDataRepository.delete(tipoData);
    }

    @Override
    public void deleteById(long id) {
        tipoDataRepository.deleteById(id);
    }
}
