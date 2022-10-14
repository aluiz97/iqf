package com.projeto.firstone.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("formulario")
public class Formulario {

    @Id
    private String codigoFormulario;

    private Integer pesoNota;

    private Integer nota;

    private String escopo; //Talvez fazer uma lista aqui

    private Fornecedor fornecedor;

    private Diretoria diretoria;
}
