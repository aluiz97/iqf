package com.projeto.firstone.controller;

import com.projeto.firstone.model.Diretoria;
import com.projeto.firstone.service.DiretoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretorias")
public class DiretoriaController {

    @Autowired
    private DiretoriaService diretoriaService;

    @GetMapping
    public List<Diretoria> obterTodasSquads() {

        return this.diretoriaService.obterTodasSquads();
    }

    @GetMapping("/{codigo}")
    public Diretoria obterSquadPorCodigo(String codigoSquad) {

        return this.diretoriaService.obterSquadPorCodigo(codigoSquad);
    }

    @PostMapping
    public Diretoria criar(@RequestBody Diretoria diretoria) {

        return this.diretoriaService.criar(diretoria);
    }
}
