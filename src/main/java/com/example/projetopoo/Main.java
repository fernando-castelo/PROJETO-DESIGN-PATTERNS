package com.example.projetopoo;

import com.example.projetopoo.builder.ConcretePizzaBuilder;
import com.example.projetopoo.model.*;
import com.example.projetopoo.repository.CondimentoRepository;
import com.example.projetopoo.repository.QueijoRepository;
import com.example.projetopoo.strategy.Context;
import com.example.projetopoo.strategy.PagamentoStrategy;
import com.example.projetopoo.strategy.PixStrategy;
import com.example.projetopoo.view.TelaPedidos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static ConcretePizzaBuilder construtor = new ConcretePizzaBuilder();

    public static QueijoRepository queijoRepositorio = new QueijoRepository();

    public static CondimentoRepository condimentoRepository = new CondimentoRepository();

    public static Scanner sc = new Scanner(System.in);

    public static Pizza build() {
        construtor.reset();
        construtor.setTamanho(selecionarTamanho());
        construtor.setSabor(selecionarSabor());
        construtor.setQueijo(selecionarQueijo());
        construtor.setCondimentos(selecionarCondimentos());
        construtor.setPreco();
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

    public static Sabor selecionarSabor() {

        Sabor saborSelecionado;

        List<String> sabores = new ArrayList<>();

        int count = 1;
        for(Sabor myVar : Sabor.values()) {
            System.out.println(count + " - " + myVar.getNome());
            count+=1;
            sabores.add(myVar.getNome());
        }

        System.out.println("Selecione um sabor para a pizza: ");
        int opcaoSelecionada = (sc.nextInt()) - 1;

        System.out.println(sabores.get(opcaoSelecionada));

        saborSelecionado = Sabor.valueOf(sabores.get(opcaoSelecionada));

        return saborSelecionado;
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



//    public static JComboBox<Tamanho> SetarComboBoxTamanho() {
//
//        JComboBox<Tamanho> comboBoxTamanhos = new JComboBox<>();
//
//        comboBoxTamanhos = new JComboBox<>();
//
//        for (Tamanho tamanho : Tamanho.values()) {
//            comboBoxTamanhos.addItem(tamanho);
//        }
//
//        return comboBoxTamanhos;
//
//
//    }


    public static void main(String[] args) {

//        Pizza pizza1 = build();
//
//        Pedido pedido1 = new Pedido(1, pizza1);

        TelaPedidos primeira = new TelaPedidos();
        primeira.setContentPane(primeira.panel1);
        primeira.setTitle("Inicio");
        primeira.setSize(500,500);
        primeira.setVisible(true);
        primeira.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        primeira.status.setText(String.valueOf(pedido1.getStatus()));

//        primeira.comboBox1.removeAllItems();
//        primeira.comboBox1.addItem();




//        primeira.comboBox1 = new JComboBox<Tamanho>();
//        primeira.comboBox1 = SetarComboBoxTamanho();

//        primeira.comboBox5 = new JComboBox<>();

//        primeira.panel1.add(primeira.comboBox1);
//        primeira.panel1.add(primeira.comboBox5);






//        System.out.println("Pizza: " + pizza1.getQueijo().getNome());
//        System.out.println("Sabor: " + pizza1.getSabor());
//        System.out.println("Tamanho: " + pizza1.getTamanho().getTexto() + " Valor: " + pizza1.getPreco());
//
//        System.out.println("Condimentos : ");
//        for(int i = 0; i < pizza1.getCondimentos().size(); i++) {
//            System.out.println(pizza1.getCondimentos().get(i).getNome());
//        }
//
//        Double valorPizza = pizza1.getPreco();
//
//        CartaoCredito cartao = new CartaoCredito();
//
//        cartao.setId(1);
//        cartao.setNome("Artorias");
//        cartao.setNumeroCartao("4546446546");
//        cartao.setDataDeExpiracao("28/08/4343");
//        cartao.setCvv("567");
//
//        PagamentoStrategy strategy = new PixStrategy();
//
//        Context contexto = new Context();
//
//        contexto.setPagamentoStrategy(strategy);
//
//        contexto.executeStrategy(valorPizza);
//
//        Pedido pedido = new Pedido(1, pizza1);
//
//        pedido.nextStatus();
//
//        pedido.getStatus().printStatus();

    }
}
