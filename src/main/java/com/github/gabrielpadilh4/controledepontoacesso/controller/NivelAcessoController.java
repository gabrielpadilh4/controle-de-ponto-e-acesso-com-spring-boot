package com.github.gabrielpadilh4.controledepontoacesso.controller;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IControllerCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.NivelAcesso;
import com.github.gabrielpadilh4.controledepontoacesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivel-acesso")
public class NivelAcessoController implements IControllerCrud<NivelAcesso> {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso create(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getList() {
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> getById(@PathVariable("idNivelAcesso") long idNivelAcesso) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.findById(idNivelAcesso).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Nível de acesso não encontrado!")));
    }

    @PutMapping
    public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity delete(@PathVariable("idNivelAcesso") long idNivelAcesso) {
        nivelAcessoService.deleteById(idNivelAcesso);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
