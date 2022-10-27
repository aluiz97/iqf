package com.projeto.firstone.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projeto.firstone.model.Diretoria;
import com.projeto.firstone.model.Formulario;
import com.projeto.firstone.model.Fornecedor;
import com.projeto.firstone.model.Squad;
import com.projeto.firstone.model.enums.Escopo;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class FormularioDTO {

    @JsonProperty("co_formulario") //nome que aparecerá no campo no json
    private ObjectId id;

    @JsonProperty("co_peso_nota")
    private Integer pesoNota;

    @JsonProperty("co_nota")
    private Integer nota;

    @JsonProperty("co_justificativa")
    private String justificativa;

    @JsonProperty("co_data")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFormulario;

    @JsonProperty("co_escopo")
    private Escopo escopo; //Talvez fazer uma lista aqui

    @JsonProperty("co_fornecedor")
    private Fornecedor fornecedor;

    @JsonProperty("co_diretoria")
    private Diretoria diretoria;

    @JsonProperty("co_squad")
    private Squad squad;

    public FormularioDTO() {
    }

    public FormularioDTO(Formulario formulario) {
        id = formulario.getId();
        pesoNota = formulario.getPesoNota();
        nota = formulario.getNota();
        justificativa = formulario.getJustificativa();
        dataFormulario = formulario.getDataFormulario();
        escopo = formulario.getEscopo();
        fornecedor = formulario.getFornecedor();
        diretoria = formulario.getDiretoria();
        squad = formulario.getSquad();
    }
}
