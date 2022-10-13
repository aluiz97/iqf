package com.projeto.firstone.service.implementation;

import com.projeto.firstone.model.Diretoria;
import com.projeto.firstone.repository.DiretoriaRepository;
import com.projeto.firstone.service.DiretoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoriaServiceImplementation implements DiretoriaService {

    @Autowired
    private DiretoriaRepository diretoriaRepository;

    @Override
    public List<Diretoria> obterTodasSquads() {
        return this.diretoriaRepository.findAll();
    }

    @Override
    public Diretoria obterSquadPorCodigo(String codigoSquad) {
        return this.diretoriaRepository.findById(codigoSquad).orElseThrow(() -> new IllegalArgumentException("Squad não encontrada"));
    }

    @Override
    public Diretoria criar(Diretoria diretoria) {
        return this.diretoriaRepository.save(diretoria);
    }
}
