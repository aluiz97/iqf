package com.projeto.firstone.service;

import com.projeto.firstone.model.Formulario;

import java.util.List;

public interface FormularioService {

    public List<Formulario> obterTodosFormularios();

    public Formulario obterFormularioPorCodigo(String codigoFormulario);

    public Formulario criarFormulario(Formulario formulario);
}
