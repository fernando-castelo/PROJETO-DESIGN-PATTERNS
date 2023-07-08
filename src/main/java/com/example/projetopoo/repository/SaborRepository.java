package com.example.projetopoo.repository;

import com.example.projetopoo.model.Sabor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SaborRepository {

    private static SaborRepository myself = null;

    private Sabor sabor;

    private List<Sabor> sabores;

    public SaborRepository() {

    }

    public static SaborRepository getCurrentInstance() {

        if(myself == null) {
            SaborRepository.myself = new SaborRepository();
        }

        return myself;
    }

    public void inicializar() {
        sabores = new ArrayList<>();

       for(Sabor myvar : sabor.values()){
            sabores.add(myvar);
        }
    }

    public List<Sabor> lerTudo() {
        return this.sabores;
    }
}
