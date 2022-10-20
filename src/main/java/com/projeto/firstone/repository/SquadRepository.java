package com.projeto.firstone.repository;

import com.projeto.firstone.model.Squad;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquadRepository extends MongoRepository<Squad, ObjectId> {

}
