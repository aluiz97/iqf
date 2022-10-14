package com.projeto.firstone.controller;

import com.projeto.firstone.model.Fornecedor;
import com.projeto.firstone.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping
    private List<Fornecedor> obterTodosFornecedores() {

        return this.fornecedorService.obterTodosFornecedores();
    }

    @PostMapping
    private Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {

        return this.fornecedorService.criarFornecedor(fornecedor);
    }

}
