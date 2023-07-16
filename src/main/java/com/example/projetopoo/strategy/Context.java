package com.example.projetopoo.strategy;

public class Context {

    private PagamentoStrategy pagamentoStrategy;

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public String executeStrategy(Double preco) {

        return  pagamentoStrategy.pagar(preco);
    }
}
