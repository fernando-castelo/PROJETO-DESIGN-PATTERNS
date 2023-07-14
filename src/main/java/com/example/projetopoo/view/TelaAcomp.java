package com.example.projetopoo.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaAcomp extends JFrame {
    public JProgressBar progressBar1;
    public JPanel panel3;
    private JButton finalizarButton;
public TelaAcomp() {
    finalizarButton.addMouseListener(new MouseAdapter() {
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
