package com.example.projetopoo.view;

import com.example.projetopoo.model.Pedido;
import com.example.projetopoo.repository.PedidoRepository;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaFinalizadora extends JFrame {
    public JPasswordField passwordField1;
    public JButton finalizarButton;
    public JButton cancelarButton;

    public JPanel PanelPrincipal;
    public JPanel PanelPix;
    public JPanel PanelCred;
    public JLabel statusField;
    public JLabel strategyField;
    public JLabel idField;
    private JLabel header;
    public JLabel valorField;
    private JLabel textoSenha;
    private JLabel QR;

    private PedidoRepository pedidoRepo;
public TelaFinalizadora() {
    cancelarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            Pedido pedido1 = pedidoRepo.getCurrentInstance().ler(0);
            pedido1.previousStatus();
            dispose();
        }
    });
}
}
