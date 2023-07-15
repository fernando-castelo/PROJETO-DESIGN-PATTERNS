package com.example.projetopoo.builder;

import com.example.projetopoo.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public void setSabor(Sabor sabor) {
        this.pizza.setSabor(sabor);
    }

    @Override
    public void setCondimentos(List<Condimentos> condimentos) {
        this.pizza.setCondimentos(condimentos);
    }

    @Override
    public void setPreco() {
        this.pizza.setPreco(
                (this.pizza.getSabor().getValorFatia() + this.pizza.getQueijo().getValor()) * this.pizza.getTamanho().getQuantidadeFatias()
        );
    }

    @Override
    public Pizza getProduct() {
        Pizza pizzaGerada = this.pizza;
        this.reset();
        return pizzaGerada;
    }


}
