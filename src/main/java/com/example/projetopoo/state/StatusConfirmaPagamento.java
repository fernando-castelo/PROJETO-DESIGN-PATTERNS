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
    public String  printStatus() {
        return "Aguardando confirmação do pagamento";
    }
}



