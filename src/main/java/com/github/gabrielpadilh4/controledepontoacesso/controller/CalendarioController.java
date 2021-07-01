package com.github.gabrielpadilh4.controledepontoacesso.controller;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IControllerCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Calendario;
import com.github.gabrielpadilh4.controledepontoacesso.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendario")
public class CalendarioController implements IControllerCrud<Calendario> {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario create(@RequestBody Calendario calendario) {
        return calendarioService.save(calendario);
    }

    @GetMapping
    public List<Calendario> getList() {
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getById(@PathVariable("idCalendario") long idCalendario) throws Exception {
        return ResponseEntity.ok(calendarioService.findById(idCalendario).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Calendario não encontrado!")));
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario) {
        return calendarioService.update(calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public ResponseEntity delete(@PathVariable("idCalendario") long idCalendario) {
        calendarioService.deleteById(idCalendario);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
