package com.projeto.firstone.service;

import com.projeto.firstone.model.Fornecedor;
import com.projeto.firstone.repository.FornecedorRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> findAll() {

        return fornecedorRepository.findAll();
    }

    public List<String> findAllNames() {

        List<Fornecedor> listAll = findAll();

        List<String> listNames = new ArrayList<>();

        for (Fornecedor fornecedores:listAll
             ) {
            listNames.add(fornecedores.getNomeFornecedor());
        }

        return listNames;
    }

    public String findIdByName(String nomeFornecedor) {

        Fornecedor fornecedor = fornecedorRepository.searchName(nomeFornecedor);

        return fornecedor.getFornecedorId().toString();
    }


}
