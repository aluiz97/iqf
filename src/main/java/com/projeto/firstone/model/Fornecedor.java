package com.projeto.firstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("fornecedor")
public class Fornecedor {

    @Id
    @JsonProperty("co_fornecedor_id")
    @Field("id")
    private ObjectId fornecedorId;

    @JsonProperty("co_nome_fornecedor")
    @Field("nome_fornecedor")
    private String nomeFornecedor;

}
