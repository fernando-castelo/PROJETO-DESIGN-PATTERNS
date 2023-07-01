package com.example.projetopoo.builder;

import com.example.projetopoo.model.Pizza;
import com.example.projetopoo.model.Queijo;
import com.example.projetopoo.model.Tamanho;

public interface PizzaBuilder {

    public void reset();

    public void setQueijo(Queijo queijo);

    public void setTamanho(Tamanho tamanho);

    public Pizza getProduct();
}
