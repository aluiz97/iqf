package com.projeto.firstone.service;

import com.projeto.firstone.model.Fornecedor;

import java.util.List;

public interface FornecedorService {

    public List<Fornecedor> obterTodosFornecedores();

    public Fornecedor obterFornecedorPorCodigo(String codigoFornecedor);

    public Fornecedor criarFornecedor(Fornecedor fornecedor);
}
