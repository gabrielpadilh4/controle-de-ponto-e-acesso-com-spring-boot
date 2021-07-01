package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.NivelAcesso;
import com.github.gabrielpadilh4.controledepontoacesso.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService implements IServiceCrud<NivelAcesso> {

    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    @Override
    public NivelAcesso save(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    @Override
    public NivelAcesso update(NivelAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    @Override
    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    @Override
    public Optional<NivelAcesso> findById(long id) {
        return nivelAcessoRepository.findById(id);
    }

    @Override
    public void delete(NivelAcesso nivelAcesso) {
        nivelAcessoRepository.delete(nivelAcesso);
    }

    @Override
    public void deleteById(long id) {
        nivelAcessoRepository.deleteById(id);
    }
}
