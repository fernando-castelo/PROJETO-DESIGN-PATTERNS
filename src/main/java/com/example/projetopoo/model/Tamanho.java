package com.example.projetopoo.model;

public enum Tamanho {

    GRANDE("GRANDE", 60), MEDIA("MEDIA", 40), PEQUENA("PEQUENA", 30);

    private String texto;

    private int valor;

    Tamanho(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }

    public String getTexto() {
        return texto;
    }

    public int getValor() {
        return valor;
    }
}
