package com.projeto.firstone.controller;

import com.projeto.firstone.model.Formulario;
import com.projeto.firstone.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formularios")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

    @GetMapping
    private List<Formulario> obterTodosFormularios() {

        return this.formularioService.obterTodosFormularios();
    }

    @PostMapping
    private Formulario criarFormulario(@RequestBody Formulario formulario) {

        return this.formularioService.criarFormulario(formulario);
    }
}
