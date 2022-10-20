package com.projeto.firstone.repository;

import com.projeto.firstone.model.Diretoria;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretoriaRepository extends MongoRepository<Diretoria, ObjectId> {

}
