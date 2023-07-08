package com.example.projetopoo.state;

import com.example.projetopoo.model.Pedido;

public interface StatusPedido {

    public void previousStatus(Pedido pedido);

    public void nextStatus(Pedido pedido);

    public void printStatus();
}
