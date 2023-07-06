package com.example.projetopoo.strategy;

import com.example.projetopoo.model.CartaoCredito;

public class CartaoCreditoStrategy implements PagamentoStrategy{

    CartaoCredito cartao;

    public CartaoCreditoStrategy(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    @Override
    public void pagar(Double preco) {
        System.out.println(preco + " pago com cartao de credito");
    }
}