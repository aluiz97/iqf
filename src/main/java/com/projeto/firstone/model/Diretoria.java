package com.projeto.firstone.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("diretoria")
public class Diretoria {

    @Id
    private ObjectId diretoriaId;
    private String nomeDiretoria;
    private String nomeAgilista;


}
