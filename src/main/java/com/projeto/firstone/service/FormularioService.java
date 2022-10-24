package com.projeto.firstone.service;

import com.projeto.firstone.model.Formulario;
import com.projeto.firstone.repository.FormularioRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    public List<Formulario> findAll(){

        return formularioRepository.findAll();
    }

    public Formulario findById(ObjectId id) {

        Optional<Formulario> formulario = formularioRepository.findById(id);

        return formulario.orElseThrow(() -> new IllegalArgumentException("Formulário não encontrado"));
    }
    public Formulario insert(Formulario formulario) {

        return formularioRepository.insert(formulario);
    }

}
