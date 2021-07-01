package com.github.gabrielpadilh4.controledepontoacesso.controller;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IControllerCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.CategoriaUsuario;
import com.github.gabrielpadilh4.controledepontoacesso.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria-usuario")
public class CategoriaUsuarioController implements IControllerCrud<CategoriaUsuario> {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario create(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getList() {
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getById(@PathVariable("idCategoria") long idCategoria) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.findById(idCategoria).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Categoria Usuario não encontrado!")));
    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity delete(@PathVariable("idCategoria") long idCategoria) {
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
