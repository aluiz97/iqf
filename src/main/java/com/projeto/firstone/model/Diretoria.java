package com.projeto.firstone.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("diretoria")
public class Diretoria {

    private String codigoSquad;

    private String squad;

    private String diretoria;

    private String agilista;
}
