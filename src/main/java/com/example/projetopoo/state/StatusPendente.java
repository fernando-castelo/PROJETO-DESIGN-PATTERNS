package com.example.projetopoo.state;

import com.example.projetopoo.model.Pedido;

public class StatusPendente implements StatusPedido{
    @Override
    public void previousStatus(Pedido pedido) {
        System.out.println("AAIAIAI");
    }

    @Override
    public void nextStatus(Pedido pedido) {
        pedido.setStatus(new StatusConfirmaPagamento());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido em andamento");
    }
}
