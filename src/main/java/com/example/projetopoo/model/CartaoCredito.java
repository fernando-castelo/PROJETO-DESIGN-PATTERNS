package com.example.projetopoo.model;

public class CartaoCredito {

    int id;
    private String nome;
    private String numeroCartao;

    private String cvv;

    private String dataDeExpiracao;

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

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDataDeExpiracao() {
        return dataDeExpiracao;
    }

    public void setDataDeExpiracao(String dataDeExpiracao) {
        this.dataDeExpiracao = dataDeExpiracao;
    }
}
