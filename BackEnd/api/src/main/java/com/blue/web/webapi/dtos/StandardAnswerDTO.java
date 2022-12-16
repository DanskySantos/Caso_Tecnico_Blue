package com.blue.web.webapi.dtos;


import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Classe que contém as respostas padrão do sistema.
 * Ex.: Utilizada para verificar se um cadastro existe ou não na base de dados.
 * Ou se uma operação foi realizada com sucesso.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StandardAnswerDTO {

    @NotNull
    private boolean sucesso = false;

    @NotBlank
    private String mensagem;

}