package com.projeto.firstone.repository;

import com.projeto.firstone.model.Diretoria;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DiretoriaRepository extends MongoRepository<Diretoria, String> {

    public List<Diretoria> findBySquad(String squad);
}
