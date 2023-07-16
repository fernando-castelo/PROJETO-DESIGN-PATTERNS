package com.example.projetopoo.strategy;

public class CartaoDebitoStrategy implements PagamentoStrategy{

    @Override
    public String pagar(Double preco) {

        return preco + " pago com cartao de debito";
    }

}
