package com.projeto.firstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("squad")
public class Squad {

    @Id
    @JsonProperty("co_squad_id")
    @Field("id")
    private ObjectId squadId;

    @JsonProperty("co_nome_squad")
    @Field("nome_squad")
    private String nomeSquad;

}
