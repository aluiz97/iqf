package com.projeto.firstone.controller;

import com.projeto.firstone.model.Formulario;
import com.projeto.firstone.service.FormularioService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/formularios")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @GetMapping
    public ResponseEntity<List<Formulario>> findAll() {

        List<Formulario> formularios = formularioService.findAll();

        return ResponseEntity.ok().body(formularios);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Formulario> findById(@PathVariable ObjectId id) {

        Formulario formulario = formularioService.findById(id);

        return ResponseEntity.ok().body(formulario);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Formulario formulario) {

        formularioService.insert(formulario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(formulario.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

}
