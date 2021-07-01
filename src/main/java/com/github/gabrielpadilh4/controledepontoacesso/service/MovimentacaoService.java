package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Movimentacao;
import com.github.gabrielpadilh4.controledepontoacesso.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService implements IServiceCrud<Movimentacao> {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    @Override
    public Movimentacao save(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    @Override
    public Movimentacao update(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    @Override
    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    @Override
    public Optional<Movimentacao> findById(long id) {
        return movimentacaoRepository.findByMIdMovimento(id);
    }

    @Override
    public void delete(Movimentacao movimentacao) {
        movimentacaoRepository.delete(movimentacao);
    }

    @Override
    public void deleteById(long id) {
        movimentacaoRepository.deleteByMIdMovimento(id);
    }
}
