package com.projeto.firstone.authentication.infra.security;

import lombok.Data;

@Data
public class DadosTokenJWT {

    private String tokenJWT;
    public DadosTokenJWT(String tokenJWT) {

        this.tokenJWT = tokenJWT;
    }

}
