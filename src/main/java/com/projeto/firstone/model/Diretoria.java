package com.projeto.firstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("diretoria")
public class Diretoria {

    @Id
    @JsonProperty("co_diretoria_id")
    @Field("id")
    private ObjectId diretoriaId;

    @JsonProperty("co_nome_diretoria")
    @Field("nome_diretoria")
    private String nomeDiretoria;

    @JsonProperty("co_nome_agilista")
    @Field("agilista")
    private String nomeAgilista;


}
