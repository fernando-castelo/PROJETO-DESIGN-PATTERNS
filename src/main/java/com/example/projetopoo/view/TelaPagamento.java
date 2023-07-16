package com.example.projetopoo.view;

import com.example.projetopoo.model.Pedido;
import com.example.projetopoo.repository.PedidoRepository;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalTime;

public class TelaPagamento extends JFrame {
    public JComboBox comboBox1;
    public JButton finalizarButton;
    public JPanel painel2;
    private JButton cancelarButton;
    public JLabel valorPagar;
    public JLabel status2;
    private JLabel teste123;

    private PedidoRepository pedidoRepo;


    public TelaPagamento() {

        System.out.println("TESTEEE " + comboBox1.getSelectedIndex());

        String valor = valorPagar.getText();

//            int valorParse = Integer.parseInt(valor);

        System.out.println("VALOR:  " + valor);

        switch (comboBox1.getSelectedIndex()){
            case 0:
                System.out.println("CREDITO");
                break;
            case 1:
                System.out.println("DEBITO");
                break;
            case 2:
                System.out.println("PIX");
                break;
        }

    finalizarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            TelaAcomp acompanha = new TelaAcomp();
            acompanha.setContentPane(acompanha.panel3);
            acompanha.setTitle("Acompanha");
            acompanha.setSize(400,400);
            acompanha.setVisible(true);
            acompanha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            acompanha.progressBar1.setValue(10);
            Pedido pedido1 = pedidoRepo.getCurrentInstance().ler(0);
            System.out.println("tedteee: " + pedido1.getPizza().getPreco()+ " " + pedido1.getStatus().printStatus());
            dispose();

        }
    });
        cancelarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TelaPedidos telapedidos = new TelaPedidos();
                telapedidos.setContentPane(telapedidos.panel1);
                telapedidos.setTitle("Acompanha");
                telapedidos.setSize(400,400);
                telapedidos.setVisible(true);
                telapedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dispose();
            }
        });
    }
}
