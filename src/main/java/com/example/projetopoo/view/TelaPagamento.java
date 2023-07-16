package com.example.projetopoo.view;

import com.example.projetopoo.model.Pedido;
import com.example.projetopoo.repository.PedidoRepository;
import com.example.projetopoo.strategy.*;

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
    finalizarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

            Context pagamento = new Context();

            Double valor = Double.parseDouble(valorPagar.getText());
            Pedido pedido1 = pedidoRepo.getCurrentInstance().ler(0);

            TelaFinalizadora telaFinalizadora = new TelaFinalizadora();
            telaFinalizadora.setContentPane(telaFinalizadora.PanelPrincipal);
            telaFinalizadora.setSize(400,400);
            telaFinalizadora.setVisible(true);


            switch (comboBox1.getSelectedIndex()){
                case 0:
                    CartaoCreditoStrategy pagamentoCartao = new CartaoCreditoStrategy();
                    pagamento.setPagamentoStrategy(pagamentoCartao);
                    pedido1.nextStatus();
                    telaFinalizadora.idField.setText(String.valueOf(pedido1.getId()));
                    telaFinalizadora.statusField.setText(pedido1.getStatus().printStatus());

                    String pagamentoSelecionado = (String) comboBox1.getSelectedItem();
                    telaFinalizadora.strategyField.setText(pagamentoSelecionado);

                    telaFinalizadora.valorField.setText(String.valueOf(valor));
                    telaFinalizadora.finalizarButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {

                            System.out.println(pagamento.executeStrategy(valor));

                            TelaAcomp telaAcomp = new TelaAcomp();
                            telaAcomp.setContentPane(telaAcomp.panel3);
                            telaAcomp.setSize(400, 400);
                            telaAcomp.setVisible(true);

                            pedido1.nextStatus();
                            telaAcomp.statusField.setText(pedido1.getStatus().printStatus());
                            telaAcomp.idField.setText(String.valueOf(pedido1.getId()));
                            telaAcomp.pagamentoField.setText(pagamento.executeStrategy(valor));
                        }
                    });
                    break;
                case 1:
                    CartaoDebitoStrategy pagamentoCartao1 = new CartaoDebitoStrategy();
                    pagamento.setPagamentoStrategy(pagamentoCartao1);
                    pedido1.nextStatus();
                    telaFinalizadora.idField.setText(String.valueOf(pedido1.getId()));
                    telaFinalizadora.statusField.setText(pedido1.getStatus().printStatus());

                    String pagamentoSelecionado1 = (String) comboBox1.getSelectedItem();
                    telaFinalizadora.strategyField.setText(pagamentoSelecionado1);

                    telaFinalizadora.valorField.setText(String.valueOf(valor));
                    telaFinalizadora.finalizarButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            System.out.println(pagamento.executeStrategy(valor));

                            TelaAcomp telaAcomp = new TelaAcomp();
                            telaAcomp.setContentPane(telaAcomp.panel3);
                            telaAcomp.setSize(400, 400);
                            telaAcomp.setVisible(true);

                            pedido1.nextStatus();
                            telaAcomp.statusField.setText(pedido1.getStatus().printStatus());
                            telaAcomp.idField.setText(String.valueOf(pedido1.getId()));
                            telaAcomp.pagamentoField.setText(pagamento.executeStrategy(valor));
                        }
                    });
                    break;
                case 2:
                    PixStrategy pagamentoCartao2 = new PixStrategy();
                    pagamento.setPagamentoStrategy(pagamentoCartao2);
                    pedido1.nextStatus();
                    telaFinalizadora.idField.setText(String.valueOf(pedido1.getId()));
                    telaFinalizadora.statusField.setText(pedido1.getStatus().printStatus());

                    String pagamentoSelecionado2 = (String) comboBox1.getSelectedItem();
                    telaFinalizadora.strategyField.setText(pagamentoSelecionado2);

                    telaFinalizadora.valorField.setText(String.valueOf(valor));
                    telaFinalizadora.finalizarButton.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            System.out.println(pagamento.executeStrategy(valor));

                            TelaAcomp telaAcomp = new TelaAcomp();
                            telaAcomp.setContentPane(telaAcomp.panel3);
                            telaAcomp.setSize(400, 400);
                            telaAcomp.setVisible(true);

                            pedido1.nextStatus();
                            telaAcomp.statusField.setText(pedido1.getStatus().printStatus());
                            telaAcomp.idField.setText(String.valueOf(pedido1.getId()));
                            telaAcomp.pagamentoField.setText(pagamento.executeStrategy(valor));
                        }
                    });
                    break;
            }

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
