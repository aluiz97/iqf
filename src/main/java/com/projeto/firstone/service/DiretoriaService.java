package com.projeto.firstone.service;

import com.projeto.firstone.model.Diretoria;
import com.projeto.firstone.repository.DiretoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoriaService {

    @Autowired
    private DiretoriaRepository diretoriaRepository;


}