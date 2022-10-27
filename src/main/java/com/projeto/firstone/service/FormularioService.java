package com.projeto.firstone.service;

import com.projeto.firstone.dto.FormularioDTO;
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

        if (formulario.getNota() < 1 || formulario.getNota() > 10) {

            throw new RuntimeException("A nota do formulário deve ser preenchido com uma nota entre 0 e 10");

        } else if (formulario.getPesoNota() < 1 || formulario.getPesoNota() > 3) {

            throw new RuntimeException("O peso da nota deve ser preenchido com uma nota entre 1 e 3");

        }

        return formularioRepository.insert(formulario);
    }

    public void delete(ObjectId id) {

        findById(id);
        formularioRepository.deleteById(id);

    }

    public Formulario update(Formulario formulario) {

        Formulario novoFormulario = formularioRepository.findById(formulario.getId()).get();
        updateData(novoFormulario, formulario);

        return formularioRepository.save(novoFormulario);
    }

    private void updateData(Formulario novoFormulario, Formulario formulario) {

        novoFormulario.setDataFormulario(formulario.getDataFormulario());
        novoFormulario.setDiretoria(formulario.getDiretoria());
        novoFormulario.setEscopo(formulario.getEscopo());
        novoFormulario.setFornecedor(formulario.getFornecedor());
        novoFormulario.setNota(formulario.getNota());
        novoFormulario.setPesoNota(formulario.getPesoNota());
        novoFormulario.setJustificativa(formulario.getJustificativa());
        novoFormulario.setSquad(formulario.getSquad());
    }

    public Formulario fromDTO(FormularioDTO formularioDTO) {

        return new Formulario(formularioDTO.getId(), formularioDTO.getPesoNota(),
                formularioDTO.getNota(), formularioDTO.getJustificativa(),
                formularioDTO.getDataFormulario(),
                formularioDTO.getEscopo(), formularioDTO.getFornecedor(),
                formularioDTO.getDiretoria(), formularioDTO.getSquad());
    }
}
