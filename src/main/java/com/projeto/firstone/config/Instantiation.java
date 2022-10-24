package com.projeto.firstone.config;

import com.projeto.firstone.model.Diretoria;
import com.projeto.firstone.model.Fornecedor;
import com.projeto.firstone.model.Squad;
import com.projeto.firstone.repository.DiretoriaRepository;
import com.projeto.firstone.repository.FormularioRepository;
import com.projeto.firstone.repository.FornecedorRepository;
import com.projeto.firstone.repository.SquadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    @Autowired
    private SquadRepository squadRepository;

    @Autowired
    private DiretoriaRepository diretoriaRepository;

    @Autowired
    private FormularioRepository formularioRepository;

    @Override
    public void run(String... args) throws Exception {

        formularioRepository.deleteAll();

        fornecedorRepository.deleteAll();
        squadRepository.deleteAll();
        diretoriaRepository.deleteAll();

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFornecedor("Delloite");

        Squad squad = new Squad();
        squad.setNomeSquad("Kratos");

        Diretoria diretoria = new Diretoria();
        diretoria.setNomeDiretoria("DS");
        diretoria.setNomeAgilista("Ronald");

        fornecedorRepository.save(fornecedor);
        squadRepository.save(squad);
        diretoriaRepository.save(diretoria);

    }


}
