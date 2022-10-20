package com.projeto.firstone.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("formulario")
public class Formulario {

    @Id
    private ObjectId formularioId;
    private Integer pesoNota;
    private Integer nota;
    private String escopo; //Talvez fazer uma lista aqui
    private LocalDate dataFormulario; //Mudar para Date
    private Fornecedor fornecedor;
    private Diretoria diretoria;
    private Squad squad;

}
