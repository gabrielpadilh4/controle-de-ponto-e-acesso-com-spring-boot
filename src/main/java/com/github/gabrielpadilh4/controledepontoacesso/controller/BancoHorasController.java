package com.github.gabrielpadilh4.controledepontoacesso.controller;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IControllerCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.BancoHoras;
import com.github.gabrielpadilh4.controledepontoacesso.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping("/banco-horas")
public class BancoHorasController implements IControllerCrud<BancoHoras> {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras create(@RequestBody BancoHoras bancoHoras) {
        UUID uuid = UUID.randomUUID();
        bancoHoras.getId().setIdBancoHoras(uuid.getMostSignificantBits());
        return bancoHorasService.save(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getList() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity getById(@PathVariable("idBancoHoras") long idBancoHoras) throws Exception {
        return ResponseEntity.ok(bancoHorasService.findById(idBancoHoras).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Banco de Horas não encontrado!")));
    }

    @PutMapping
    public BancoHoras update(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.update(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity delete(@PathVariable("idBancoHoras") long idBancoHoras) {
        bancoHorasService.deleteById(idBancoHoras);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
