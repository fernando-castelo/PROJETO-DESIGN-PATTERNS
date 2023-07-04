package com.example.projetopoo.builder;

import com.example.projetopoo.model.*;

import java.util.List;

public interface PizzaBuilder {

    public void reset();

    public void setQueijo(Queijo queijo);

    public void setTamanho(Tamanho tamanho);

    public void setSabor(Sabor sabor);

    public void setCondimentos(List<Condimentos> condimentos);

    public void setPreco();

    public Pizza getProduct();
}
