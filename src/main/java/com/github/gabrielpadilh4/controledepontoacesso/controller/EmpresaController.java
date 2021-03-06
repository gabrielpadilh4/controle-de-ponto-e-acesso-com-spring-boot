package com.github.gabrielpadilh4.controledepontoacesso.controller;

import com.github.gabrielpadilh4.controledepontoacesso.helpers.base.IControllerCrud;
import com.github.gabrielpadilh4.controledepontoacesso.model.Empresa;
import com.github.gabrielpadilh4.controledepontoacesso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EmpresaController implements IControllerCrud<Empresa> {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa) {
        return empresaService.save(empresa);
    }

    @GetMapping
    public List<Empresa> getList() {
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getById(@PathVariable("idEmpresa") long idEmpresa) throws Exception {
        return ResponseEntity.ok(empresaService.findById(idEmpresa).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Empresa não encontrada")));
    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa) {
        return empresaService.update(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity delete(@PathVariable("idEmpresa") long idEmpresa) {
        empresaService.deleteById(idEmpresa);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
