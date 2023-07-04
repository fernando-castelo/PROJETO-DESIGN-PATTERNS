package com.example.projetopoo.repository;

import com.example.projetopoo.model.Queijo;

import java.util.ArrayList;
import java.util.List;

public class QueijoRepository {

    private static QueijoRepository myself = null;

    private List<Queijo> queijos;

    public QueijoRepository() {

        this.queijos = new ArrayList<>();

        Queijo q1 = new Queijo();

        q1.setId(1);
        q1.setNome("Mussarela");
        q1.setQuantidade(50);
        q1.setValor(2);

        Queijo q2 = new Queijo();

        q2.setId(2);
        q2.setNome("Provolone");
        q2.setQuantidade(50);
        q2.setValor(3);

        inserir(q1);
        inserir(q2);
    }

    public static QueijoRepository getCurrentInstance() {

        if(myself == null) {
           QueijoRepository.myself = new QueijoRepository();
        }

        return myself;
    }

    public void inserir(Queijo q) {
        this.queijos.add(q);
    }

    public Queijo ler(int id) {

        for(Queijo q : queijos){
            if(q.getId() == id) {
                return q;
            }
        }

        return null;
    }

    public List<Queijo> lerTudo() {
        return this.queijos;
    }
}
