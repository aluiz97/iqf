package com.projeto.firstone.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("fornecedor")
public class Fornecedor {

    @Id
    private ObjectId fornecedorId;
    private String nomeFornecedor;

}
