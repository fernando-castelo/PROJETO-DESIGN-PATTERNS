package com.example.projetopoo.strategy;

import com.example.projetopoo.model.CartaoCredito;

public class CartaoCreditoStrategy implements PagamentoStrategy{

    @Override
    public String pagar(Double preco) {

        return preco + " pago com cartao de credito";
    }
}