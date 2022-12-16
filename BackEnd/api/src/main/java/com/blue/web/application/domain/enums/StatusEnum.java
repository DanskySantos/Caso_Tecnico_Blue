package com.blue.web.application.domain.enums;

public enum StatusEnum {
    INATIVO,
    ATIVO;

    public boolean isAtivo() {
        return this.equals(ATIVO);
    }

    public boolean isInativo() {
        return this.equals(INATIVO);
    }

    public static StatusEnum get(String sigla){
        StatusEnum retorno = null;

        for (StatusEnum value : StatusEnum.values()) {
            if(value.name().equals(sigla)){
                retorno = value;
                break;
            }
        }

        return retorno;
    }
}
