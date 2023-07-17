package com.example.projetopoo.view;

import com.example.projetopoo.model.Pedido;
import com.example.projetopoo.repository.PedidoRepository;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaAcomp extends JFrame {
    public JProgressBar progressBar1;
    public JPanel panel3;
    private JButton finalizarButton;
    public JLabel statusField;
    public JLabel idField;
    public JLabel pagamentoField;
    public PedidoRepository pedidoRepo;
    public int cont =0;


    public TelaAcomp() {
    finalizarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            TelaEnd telaEnd = new TelaEnd();
            telaEnd.setContentPane(telaEnd.panel4);
            telaEnd.setTitle("Inicio");
            telaEnd.setSize(400,400);
            telaEnd.setVisible(true);
            cont=0;
            telaEnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Pedido pedido = pedidoRepo.getCurrentInstance().ler(Integer.parseInt(idField.getText()));
            pedido.nextStatus();

            telaEnd.statusField.setText(pedido.getStatus().printStatus());

            dispose();
        }
    });
}
}
