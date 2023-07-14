package com.example.projetopoo.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPagamento extends JFrame {
    public JComboBox comboBox1;
    public JButton finalizarButton;
    public JPanel panel2;
    private JButton cancelarButton;
    public JLabel valorPagar;

    public TelaPagamento() {

    finalizarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            TelaAcomp acompanha = new TelaAcomp();
            acompanha.setContentPane(acompanha.panel3);
            acompanha.setTitle("Acompanha");
            acompanha.setSize(400,400);
            acompanha.setVisible(true);
            acompanha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
