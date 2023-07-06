package com.example.projetopoo.model;

import java.util.List;

public class Pizza {
    int id;
    private Tamanho tamanho;
    private Queijo queijo;
    private List<Condimentos> condimentos;
    private Sabor sabor;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public List<Condimentos> getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(List<Condimentos> condimentos) {
        this.condimentos = condimentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }
}
