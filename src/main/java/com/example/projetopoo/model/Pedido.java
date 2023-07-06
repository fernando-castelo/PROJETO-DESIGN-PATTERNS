package com.example.projetopoo.model;

import com.example.projetopoo.state.StatusPedido;
import com.example.projetopoo.state.StatusPendente;

public class Pedido {

    int id;

    Pizza pizza;

    public Pedido(int id, Pizza pizza) {
        this.id = id;
        this.pizza = pizza;
    }

    private StatusPedido status = new StatusPendente();

    public void previousStatus() {
        status.previousStatus(this);
    }

    public void nextStatus() {
        status.nextStatus(this);
    }

    public void printStatus() {
        status.printStatus();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
}
