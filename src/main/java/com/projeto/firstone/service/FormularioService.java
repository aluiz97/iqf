package com.projeto.firstone.service;

import com.projeto.firstone.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

}
