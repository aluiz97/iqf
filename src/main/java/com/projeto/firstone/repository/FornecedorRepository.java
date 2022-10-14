package com.projeto.firstone.repository;

import com.projeto.firstone.model.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String> {
}
