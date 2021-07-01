package com.github.gabrielpadilh4.controledepontoacesso.controller;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IControllerCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Movimentacao;
import com.github.gabrielpadilh4.controledepontoacesso.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController implements IControllerCrud<Movimentacao> {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.save(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getList() {
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getById(@PathVariable("idMovimentacao") long idMovimentacao) throws Exception {
        return ResponseEntity.ok(movimentacaoService.findById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Movimentação não encontrada!")));
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity delete(@PathVariable("idMovimentacao") long idMovimentacao) {
        movimentacaoService.deleteById(idMovimentacao);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
