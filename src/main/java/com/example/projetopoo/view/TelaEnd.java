package com.example.projetopoo.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaEnd extends JFrame {
    public JPanel panel4;
    private JButton novoPedidoButton;
    public JLabel statusField;

    public TelaEnd() {
    novoPedidoButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            dispose();
            ;
        }
    });
}
}
