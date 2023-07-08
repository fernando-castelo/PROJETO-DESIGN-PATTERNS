package com.example.projetopoo.repository;

import com.example.projetopoo.model.Tamanho;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TamanhoRepository {

    private static TamanhoRepository myself = null;
    private Tamanho tamanho;

    private List<Tamanho> tamanhos;

    public TamanhoRepository() {

    }

    public static TamanhoRepository getCurrentInstance() {

        if(myself == null) {
            TamanhoRepository.myself = new TamanhoRepository();
        }

        return myself;
    }

    public void inicializar() {
        tamanhos = new ArrayList<>();

        for(Tamanho myvar : tamanho.values()) {
            tamanhos.add(myvar);
        }
    }
    public List<Tamanho> lerTudo() {
        return this.tamanhos;
    }
}
