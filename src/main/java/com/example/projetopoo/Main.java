package com.example.projetopoo;

import com.example.projetopoo.builder.ConcretePizzaBuilder;
import com.example.projetopoo.model.Condimentos;
import com.example.projetopoo.model.Pizza;
import com.example.projetopoo.model.Queijo;
import com.example.projetopoo.model.Tamanho;
import com.example.projetopoo.repository.CondimentoRepository;
import com.example.projetopoo.repository.QueijoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Tamanho tamanho1 = Tamanho.MEDIA;

    public static ConcretePizzaBuilder construtor = new ConcretePizzaBuilder();

    public static QueijoRepository queijoRepositorio = new QueijoRepository();

    public static CondimentoRepository condimentoRepository = new CondimentoRepository();

    public static Scanner sc = new Scanner(System.in);

    public static Pizza build() {
        construtor.reset();
        construtor.setTamanho(selecionarTamanho());
        construtor.setQueijo(selecionarQueijo());
        construtor.setCondimentos(selecionarCondimentos());
        return construtor.getProduct();
    }


    public static Tamanho selecionarTamanho() {

        Tamanho tamanhoSelecionado;

        List<String> tamanhos = new ArrayList<>();

        int count = 1;
        for(Tamanho myVar : Tamanho.values()) {
            System.out.println(count + " - " + myVar.getTexto());
            count+=1;
            tamanhos.add(myVar.getTexto());
        }

        System.out.println("Selecione um tamanho para a pizza: ");
        int opcaoSelecionada = (sc.nextInt()) - 1;

        tamanhoSelecionado = Tamanho.valueOf(tamanhos.get(opcaoSelecionada));

        return tamanhoSelecionado;

    }


    public static void exibirQueijos() {

        List<Queijo> queijos = queijoRepositorio.lerTudo();

        int count = 1;
        for(Queijo q : queijos) {
            System.out.println(count + " " + q.toString());
            count += 1;
        }

    }

    public static Queijo selecionarQueijo() {

        Queijo queijoSelecionado;

        exibirQueijos();
        System.out.println("Selecione uma opcao de queijo: ");
        int opcaoSelecionada = (sc.nextInt()) - 1;

        List<Queijo> queijos = queijoRepositorio.lerTudo();

        if(queijos.get(opcaoSelecionada) == null) {
            System.out.println("Opcao Indisponivel");
            return queijoSelecionado = null;
        } else {
            return queijoSelecionado = queijos.get(opcaoSelecionada);
        }

    }

    public static void exibirCondimentos() {

        List<Condimentos> condimentos = condimentoRepository.lerTudo();

        int count = 1;
        for(Condimentos c : condimentos) {
            System.out.println(count + " - " + c.getNome());
            count+=1;
        }

    }

    public static List<Condimentos> selecionarCondimentos() {

        List<Condimentos> condimentosSelecionados = new ArrayList<>();

        while (true) {
            exibirCondimentos();
            System.out.println("Selecione um condimento: ");
            int opcaoSelecionada = (sc.nextInt()) - 1;

            List<Condimentos> condimentos = condimentoRepository.lerTudo();

            if(!condimentosSelecionados.contains(condimentos.get(opcaoSelecionada))){
                condimentosSelecionados.add(condimentos.get(opcaoSelecionada));
            } else {
                System.out.println("Essa opcao ja foi selecionada.");
            }

            System.out.println("Deseja selecionar mais um condimento? (SIM ou NAO)");
            String resposta = sc.next();
            System.out.println(resposta);

             if (resposta.equals("NAO")) {
                break;
            } else if(resposta.equals("SIM")) {
                System.out.println("Condimento Adicionado!");
            } else {
                 System.out.println("Opcao Invalida!");
             }


        }

        return condimentosSelecionados;
    }


    public static void main(String[] args) {

        Pizza pizza1 = build();

        System.out.println("Pizza: " + pizza1.getQueijo().getNome());
        System.out.println("Tamanho: " + pizza1.getTamanho().getTexto() + " Valor: " + (pizza1.getTamanho().getValor() + pizza1.getQueijo().getValor()));

        System.out.println("Condimentos : ");
        for(int i = 0; i < pizza1.getCondimentos().size(); i++) {
            System.out.println(pizza1.getCondimentos().get(i).getNome());
        }
    }
}
