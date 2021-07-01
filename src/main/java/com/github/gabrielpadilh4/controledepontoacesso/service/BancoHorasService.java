package com.github.gabrielpadilh4.controledepontoacesso.service;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IServiceCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.BancoHoras;
import com.github.gabrielpadilh4.controledepontoacesso.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService implements IServiceCrud<BancoHoras> {

    @Autowired
    BancoHorasRepository bancoHorasRepository;

    @Override
    public BancoHoras save(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    @Override
    public BancoHoras update(BancoHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    @Override
    public List<BancoHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    @Override
    public Optional<BancoHoras> findById(long id) {
        return bancoHorasRepository.findByMIdBancoHoras(id);
    }

    @Override
    public void delete(BancoHoras bancoHoras) {
        bancoHorasRepository.delete(bancoHoras);
    }

    @Override
    public void deleteById(long id) {
        bancoHorasRepository.deleteByMIdBancoHoras(id);
    }
}
