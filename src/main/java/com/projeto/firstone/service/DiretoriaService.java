package com.projeto.firstone.service;

import com.projeto.firstone.model.Diretoria;

import java.util.List;

public interface DiretoriaService {

    public List<Diretoria> obterTodasSquads();

    public Diretoria obterSquadPorCodigo(String codigoSquad);

    public Diretoria criar(Diretoria diretoria);
}
