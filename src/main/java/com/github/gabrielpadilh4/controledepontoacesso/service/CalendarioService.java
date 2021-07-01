package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Calendario;
import com.github.gabrielpadilh4.controledepontoacesso.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService implements IServiceCrud<Calendario> {

    @Autowired
    CalendarioRepository calendarioRepository;

    @Override
    public Calendario save(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    @Override
    public Calendario update(Calendario calendario) {
        return calendarioRepository.save(calendario);
    }

    @Override
    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    @Override
    public Optional<Calendario> findById(long id) {
        return calendarioRepository.findById(id);
    }

    @Override
    public void delete(Calendario calendario) {
        calendarioRepository.delete(calendario);
    }

    @Override
    public void deleteById(long id) {
        calendarioRepository.deleteById(id);
    }
}
