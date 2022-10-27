package com.projeto.firstone.controller;

import com.projeto.firstone.model.Fornecedor;
import com.projeto.firstone.service.FornecedorService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll() {

        List<Fornecedor> fornecedores = fornecedorService.findAll();

        return ResponseEntity.ok().body(fornecedores);
    }

    @GetMapping("/nomes")
    public ResponseEntity<List<String>> findAllNames() {

        List<String> nomes_fornecedores = fornecedorService.findAllNames();

        return ResponseEntity.ok().body(nomes_fornecedores);
    }

    @GetMapping("/idsearch")
    public ResponseEntity<String> findIdByName(@RequestParam(value = "nomeFornecedor", defaultValue = "") String nomeFornecedor) {

        return ResponseEntity.ok().body( fornecedorService.findIdByName(nomeFornecedor));
    }

}
