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
//    @JsonProperty("co_formulario") //nome que aparecerá no campo no json
//    @Field("id") //nome que será salvo no banco
    private ObjectId id;

//    @JsonProperty("co_formulario")
//    @Field("id")
    private Integer pesoNota;

 //   @JsonProperty("co_formulario")
 //   @Field("id")
    private Integer nota;

    //private LocalDate dataFormulario;
 //   @JsonProperty("co_formulario")
 //   @Field("id")
    private Escopo escopo; //Talvez fazer uma lista aqui

    @DBRef
    private Fornecedor fornecedor;
    @DBRef
    private Diretoria diretoria;
    @DBRef
    private Squad squad;

}
