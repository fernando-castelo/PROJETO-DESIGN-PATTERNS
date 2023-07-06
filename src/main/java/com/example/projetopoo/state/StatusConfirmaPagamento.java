package com.example.projetopoo.state;

import com.example.projetopoo.model.Pedido;

public class StatusConfirmaPagamento implements StatusPedido {

    @Override
    public void previousStatus(Pedido pedido) {
        pedido.setStatus(new StatusPendente());
    }

    @Override
    public void nextStatus(Pedido pedido) {
        pedido.setStatus(new StatusProducao());
    }

    @Override
    public void printStatus() {
        System.out.println("Aguardando confirmação do pagamento");
    }
}



