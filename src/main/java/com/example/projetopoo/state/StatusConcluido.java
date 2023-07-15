package com.example.projetopoo.state;


import com.example.projetopoo.model.Pedido;

public class StatusConcluido implements StatusPedido {

    @Override
    public void previousStatus(Pedido pedido) {
        pedido.setStatus(new StatusProducao());
    }

    @Override
    public void nextStatus(Pedido pedido) {
    System.out.println("Teste");
    }

    @Override
    public String printStatus() {

        return "Pedido Concluido!";
    }
}

