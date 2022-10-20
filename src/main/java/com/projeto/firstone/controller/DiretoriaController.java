package com.projeto.firstone.controller;

import com.projeto.firstone.service.DiretoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diretorias")
public class DiretoriaController {

    @Autowired
    private DiretoriaService diretoriaService;

}
