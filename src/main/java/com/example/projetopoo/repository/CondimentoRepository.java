package com.example.projetopoo.repository;

import com.example.projetopoo.model.Condimentos;

import java.util.ArrayList;
import java.util.List;

public class CondimentoRepository {

    public static CondimentoRepository myself = null;

    private List<Condimentos> condimentos;

    public CondimentoRepository() {

        this.condimentos = new ArrayList<>();

        Condimentos c1 = new Condimentos();

        c1.setId(1);
        c1.setNome("Ketchup");
        c1.setQuantidade(50);

        Condimentos c2 = new Condimentos();

        c2.setId(2);
        c2.setNome("Mostarda");
        c2.setQuantidade(50);

        inserir(c1);
        inserir(c2);

    }

    public static CondimentoRepository getCurrentInstance() {

        if(myself == null) {
            CondimentoRepository.myself = new CondimentoRepository();
        }

        return myself;
    }

    public void inserir(Condimentos c) {
        this.condimentos.add(c);
    }

    public Condimentos ler(int id) {

        for(Condimentos c : condimentos) {
            if(c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public List<Condimentos> lerTudo() {
        return this.condimentos;
    }

}
