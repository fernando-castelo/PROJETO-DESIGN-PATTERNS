package com.example.projetopoo.builder;

import com.example.projetopoo.model.Pizza;
import com.example.projetopoo.model.Queijo;
import com.example.projetopoo.model.Tamanho;

public class ConcretePizzaBuilder implements PizzaBuilder {

    private Pizza pizza;
    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void setQueijo(Queijo queijo) {
        this.pizza.setQueijo(queijo);
    }

    @Override
    public void setTamanho(Tamanho tamanho) {
        this.pizza.setTamanho(tamanho);
    }

    @Override
    public Pizza getProduct() {
        Pizza pizzaGerada = this.pizza;
        this.reset();
        return pizzaGerada;
    }
}
