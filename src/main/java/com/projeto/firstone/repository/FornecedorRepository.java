package com.projeto.firstone.repository;

import com.projeto.firstone.model.Fornecedor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends MongoRepository<Fornecedor, ObjectId> {

    @Query("{ 'nomeFornecedor': { $regex: ?0, $options: 'i' } }")
    Fornecedor searchName(String nomeFornecedor);
}
