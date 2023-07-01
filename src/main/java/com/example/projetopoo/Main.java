package com.example.projetopoo;

import com.example.projetopoo.builder.ConcretePizzaBuilder;
import com.example.projetopoo.model.Pizza;
import com.example.projetopoo.model.Queijo;
import com.example.projetopoo.model.Tamanho;
import com.example.projetopoo.repository.QueijoRepository;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static Tamanho tamanho1 = Tamanho.MEDIA;

    public static ConcretePizzaBuilder construtor = new ConcretePizzaBuilder();

    public static QueijoRepository queijoRepositorio = new QueijoRepository();

    public static Scanner sc = new Scanner(System.in);

    public static Queijo queijoSelecionado;

    public static Pizza build() {
        construtor.reset();
        selecionarQueijo();
        construtor.setQueijo(queijoSelecionado);
        construtor.setTamanho(tamanho1);
        return construtor.getProduct();
    }


    public static void exibirQueijos() {

        List<Queijo> queijos = queijoRepositorio.lerTudo();

        int count = 1;
        for(Queijo q : queijos) {
            System.out.println(count + " " + q.toString());
            count += 1;
        }

    }

    public static void selecionarQueijo() {

        exibirQueijos();
        System.out.println("Selecione uma opcao de queijo: ");
        int opcaoSelecionada = (sc.nextInt()) - 1;

        List<Queijo> queijos = queijoRepositorio.lerTudo();

        if(queijos.get(opcaoSelecionada) == null) {
            System.out.println("Opcao Indisponivel");
            queijoSelecionado = null;
        } else {
            queijoSelecionado = queijos.get(opcaoSelecionada);
        }

    }


    public static void main(String[] args) {

        Pizza pizza1 = build();

        System.out.println("Pizza: " + pizza1.getQueijo().getNome());
        System.out.println("Tamanho: " + pizza1.getTamanho().getTexto() + " Valor: " + (pizza1.getTamanho().getValor() + pizza1.getQueijo().getValor()));

    }
}
