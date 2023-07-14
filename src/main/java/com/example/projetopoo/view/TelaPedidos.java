package com.example.projetopoo.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPedidos extends JFrame {

    public JPanel panel1;
    public JComboBox comboBox1;
    public JComboBox comboBox2;
    public JComboBox comboBox3;
    public JComboBox comboBox4;
    public JButton finalizarButton;
    public JButton voltaButton;



public TelaPedidos() {

    finalizarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            comboBox1.getSelectedItem();
            comboBox2.getSelectedItem();
            comboBox3.getSelectedItem();


            TelaPagamento pagamento = new TelaPagamento();
            pagamento.setContentPane(pagamento.panel2);
            pagamento.setTitle("Inicio");
            pagamento.setSize(400,400);
            pagamento.setVisible(true);
            pagamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pagamento.valorPagar.setText("R$:80,00");
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
