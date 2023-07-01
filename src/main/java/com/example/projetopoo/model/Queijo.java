package com.example.projetopoo.model;

public class Queijo {

    int id;
    String nome;
    int quantidade;

    int valor;

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
