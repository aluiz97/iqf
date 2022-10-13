package com.projeto.firstone.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("diretorias")
public class Diretoria {

    @Id
    private String codigoSquad;

    private String squad;

    private String diretoria;

    private String agilista;
}
