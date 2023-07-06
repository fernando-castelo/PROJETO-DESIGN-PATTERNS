package com.example.projetopoo.strategy;

public class PixStrategy implements PagamentoStrategy {

    @Override
    public void pagar(Double preco) {
        System.out.println(preco + " pago com pix");
    }
}
