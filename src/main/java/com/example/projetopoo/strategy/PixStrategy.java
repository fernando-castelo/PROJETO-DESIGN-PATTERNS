package com.example.projetopoo.strategy;

public class PixStrategy implements PagamentoStrategy {

    @Override
    public String pagar(Double preco) {
        return preco + " pago com pix";
    }
}
