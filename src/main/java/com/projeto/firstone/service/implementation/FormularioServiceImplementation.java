package com.projeto.firstone.service.implementation;

import com.projeto.firstone.model.Formulario;
import com.projeto.firstone.repository.FormularioRepository;
import com.projeto.firstone.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioServiceImplementation implements FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    @Override
    public List<Formulario> obterTodosFormularios() {
        return this.formularioRepository.findAll();
    }

    @Override
    public Formulario obterFormularioPorCodigo(String codigoFormulario) {
        return this.formularioRepository.findById(codigoFormulario)
                .orElseThrow(() -> new IllegalArgumentException("Formulário não encontrado"));
    }

    @Override
    public Formulario criarFormulario(Formulario formulario) {
        return this.formularioRepository.save(formulario);
    }
}
