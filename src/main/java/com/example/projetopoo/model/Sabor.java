package com.example.projetopoo.model;

public enum Sabor {

    PORTUGUESA("PORTUGUESA", 5),MUSSARELA("MUSSARELA", 3),CALABRESA("CALABRESA", 4),
    QUATROQUEIJOS("QUATROQUEIJOS", 5);

    private String nome;

    private double valorFatia;

    Sabor(String nome, int valorFatia) {
        this.nome = nome;
        this.valorFatia = valorFatia;
    }

    public String getNome() {
        return nome;
    }

    public double getValorFatia() {
        return valorFatia;
    }
}
