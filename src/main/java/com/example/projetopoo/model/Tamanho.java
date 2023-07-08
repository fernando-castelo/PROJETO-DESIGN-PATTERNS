package com.example.projetopoo.model;

import org.springframework.context.annotation.Bean;

public enum Tamanho {

    GRANDE("GRANDE", 8), MEDIA("MEDIA", 6), PEQUENA("PEQUENA", 4);

    private String texto;

    private int quantidadeFatias;

    Tamanho(String texto, int unidades) {
        this.texto = texto;
        this.quantidadeFatias = unidades;
    }

    public String getTexto() {
        return texto;
    }

    public int getQuantidadeFatias() {
        return quantidadeFatias;
    }
}
