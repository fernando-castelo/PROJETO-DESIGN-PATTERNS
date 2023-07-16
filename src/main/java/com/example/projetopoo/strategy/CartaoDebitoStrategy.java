package com.example.projetopoo.strategy;

public class CartaoDebitoStrategy implements PagamentoStrategy{

    @Override
    public void pagar(Double preco) {
        System.out.println(preco + " pago com cartao de debito");
    }

}
