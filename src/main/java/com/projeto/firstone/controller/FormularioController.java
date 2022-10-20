package com.projeto.firstone.controller;

import com.projeto.firstone.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formularios")
public class FormularioController {

    @Autowired
    private FormularioService formularioService;

}
