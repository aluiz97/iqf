package com.projeto.firstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.projeto.firstone.model.enums.Escopo;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@Document("formulario")
public class Formulario {

    @Id
    @JsonProperty("co_formulario") //nome que aparecerá no campo no json
    @Field("id") //nome que será salvo no banco
    private ObjectId id;

    @JsonProperty("co_peso_nota")
    @Field("peso_nota")
    private Integer pesoNota;

    @JsonProperty("co_nota")
    @Field("nota")
    private Integer nota;

    @JsonProperty("co_data")
    @Field("data")
    private LocalDate dataFormulario;

    @JsonProperty("co_escopo")
    @Field("escopo")
    private Escopo escopo; //Talvez fazer uma lista aqui

    @JsonProperty("co_fornecedor")
    @Field("fornecedor")
    @DBRef
    private Fornecedor fornecedor;

    @JsonProperty("co_diretoria")
    @Field("diretoria")
    @DBRef
    private Diretoria diretoria;

    @JsonProperty("co_squad")
    @Field("squad")
    @DBRef
    private Squad squad;

}
