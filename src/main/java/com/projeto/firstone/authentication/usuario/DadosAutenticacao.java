package com.projeto.firstone.authentication.usuario;

import lombok.*;

@Data
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DadosAutenticacao {

    private String login;
    private String senha;
}
