package com.projeto.firstone.controller;

import com.projeto.firstone.dto.FormularioDTO;
import com.projeto.firstone.model.Formulario;
import com.projeto.firstone.service.FormularioService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/formularios")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @GetMapping
    public ResponseEntity<List<FormularioDTO>> findAll() {

        List<Formulario> formularios = formularioService.findAll();

        List<FormularioDTO> formulariosDto = formularios.stream().map(x -> new FormularioDTO(x)).collect(Collectors.toList());

        return ResponseEntity.ok().body(formulariosDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formulario> findById(@PathVariable ObjectId id) {

        Formulario formulario = formularioService.findById(id);

        return ResponseEntity.ok().body(formulario);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody FormularioDTO formularioDto) {

        Formulario formulario = formularioService.fromDTO(formularioDto);
        formularioService.insert(formulario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(formulario.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ObjectId id) {

        formularioService.delete(id);

        return ResponseEntity.noContent().build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@RequestBody FormularioDTO formularioDto, @PathVariable ObjectId id) {

        Formulario formulario = formularioService.fromDTO(formularioDto);

        formulario.setId(id);
        formulario = formularioService.update(formulario);

        return ResponseEntity.noContent().build();
    }

}
