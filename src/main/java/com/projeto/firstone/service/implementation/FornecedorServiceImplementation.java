package com.projeto.firstone.service.implementation;

import com.projeto.firstone.model.Fornecedor;
import com.projeto.firstone.repository.FornecedorRepository;
import com.projeto.firstone.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorServiceImplementation implements FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Override
    public List<Fornecedor> obterTodosFornecedores() {
        return this.fornecedorRepository.findAll();
    }

    @Override
    public Fornecedor obterFornecedorPorCodigo(String codigoFornecedor) {
        return this.fornecedorRepository.findById(codigoFornecedor)
                .orElseThrow(() -> new IllegalArgumentException("Fornecedor não existe"));
    }

    @Override
    public Fornecedor criarFornecedor(Fornecedor fornecedor) {
        return this.fornecedorRepository.save(fornecedor);
    }
}
