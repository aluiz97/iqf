package com.projeto.firstone.repository;

import com.projeto.firstone.model.Formulario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormularioRepository extends MongoRepository<Formulario, String> {
}
