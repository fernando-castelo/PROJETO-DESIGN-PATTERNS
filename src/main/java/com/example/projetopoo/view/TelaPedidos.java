package com.example.projetopoo.view;

import com.example.projetopoo.builder.ConcretePizzaBuilder;
import com.example.projetopoo.model.*;
import com.example.projetopoo.repository.CondimentoRepository;
import com.example.projetopoo.repository.QueijoRepository;
import com.example.projetopoo.repository.TamanhoRepository;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class TelaPedidos extends JFrame {

    public JPanel panel1;
    public JComboBox comboBox1;
    public JComboBox comboBox2;
    public JComboBox comboBox3;
    public JComboBox comboBox4;
    public JButton finalizarButton;
    public JButton voltaButton;

    public static Tamanho tamanho;

//    public static TamanhoRepository tamanhoRepo;

    public static Sabor sabor;
    public static QueijoRepository queijoRepo;

    public static CondimentoRepository condimentoRepo;

    public static ConcretePizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();

    public static Tamanho tamanhoEscolhido;

    public static Queijo queijoEscolhido;

    public static Sabor saborEscolhido;

    public static Pizza pizzaGerada;

    public Pizza build() {
        pizzaBuilder.reset();
        pizzaBuilder.setTamanho(tamanhoEscolhido);
        pizzaBuilder.setQueijo(queijoEscolhido);
        pizzaBuilder.setSabor(saborEscolhido);
        pizzaBuilder.setPreco();
        return pizzaBuilder.getProduct();

    }

public TelaPedidos() {

    this.comboBox1.removeAllItems();

    for(Tamanho tamanho1 : tamanho.values()) {
        this.comboBox1.addItem(tamanho1);
    }

    this.comboBox2.removeAllItems();

    List<Queijo> queijos = queijoRepo.getCurrentInstance().lerTudo();
    for(Queijo queijoAux : queijos) {
        this.comboBox2.addItem(queijoAux);
    }

    this.comboBox3.removeAllItems();

    for(Sabor saborAux : sabor.values() ) {
        this.comboBox3.addItem(saborAux);
    }

    this.comboBox4.removeAllItems();

    List<Condimentos> condimentos = condimentoRepo.getCurrentInstance().lerTudo();
    for(Condimentos condimentoAux : condimentos) {
        this.comboBox4.addItem(condimentoAux);
    }

    finalizarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

            tamanhoEscolhido = (Tamanho) comboBox1.getSelectedItem();
            queijoEscolhido = (Queijo) comboBox2.getSelectedItem();
            saborEscolhido = (Sabor) comboBox3.getSelectedItem();
//            Condimentos condimentos = (Condimentos) comboBox4.getSelectedItem();


            pizzaGerada = build();

            String preco = String.valueOf(pizzaGerada.getPreco());

            System.out.println("PIZZA: " + pizzaGerada.getPreco() + " " + pizzaGerada.getSabor() + " " + pizzaGerada.getTamanho().getTexto());

//
//            System.out.println("TESTEE: " +  tamanho.getTexto() + " " + tamanho.getQuantidadeFatias());
//            System.out.println("QUEIJOO: "  + queijo.getNome() + " " + queijo.getValor());
//            System.out.println("TESTEE: " + sabor.getNome() + " " + sabor.getValorFatia());
//            System.out.println("CONDIMENTOO: " + condimentos.getNome() + " " + condimentos.getQuantidade());

            TelaPagamento pagamento = new TelaPagamento();
            pagamento.setContentPane(pagamento.panel2);
            pagamento.setTitle("Inicio");
            pagamento.setSize(400,400);
            pagamento.setVisible(true);
            pagamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pagamento.valorPagar.setText("R$ " + preco);
            dispose();
        }
    });
    voltaButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            TelaEnd telaEnd = new TelaEnd();
            telaEnd.setContentPane(telaEnd.panel4);
            telaEnd.setTitle("Inicio");
            telaEnd.setSize(400,400);
            telaEnd.setVisible(true);
            telaEnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();

        }
    });


}

}
