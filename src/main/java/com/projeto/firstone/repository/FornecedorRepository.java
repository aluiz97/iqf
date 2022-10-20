package com.projeto.firstone.repository;

import com.projeto.firstone.model.Fornecedor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, ObjectId> {

}
