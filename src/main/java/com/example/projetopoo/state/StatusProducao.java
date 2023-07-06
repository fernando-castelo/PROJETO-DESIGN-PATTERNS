package com.example.projetopoo.state;

import com.example.projetopoo.model.Pedido;

public class StatusProducao implements StatusPedido {

    @Override
    public void previousStatus(Pedido pedido) {
        pedido.setStatus(new StatusConfirmaPagamento());
    }

    @Override
    public void nextStatus(Pedido pedido) {
        pedido.setStatus(new StatusConcluido());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido em produção");
    }
}
