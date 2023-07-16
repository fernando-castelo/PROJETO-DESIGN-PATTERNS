package com.example.projetopoo.repository;

import com.example.projetopoo.model.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PedidoRepository {

    private static PedidoRepository myself = null;

    private List<Pedido> pedidos;

    private static int lastIndex = 0;

    public PedidoRepository() {
        this.pedidos = new ArrayList<>();

    }

    public static PedidoRepository getCurrentInstance() {

        if(myself == null) {
            PedidoRepository.myself = new PedidoRepository();
        }

        return myself;
    }

    public void inserir(Pedido p) {
        p.setId(lastIndex);
        lastIndex++;
        this.pedidos.add(p);
    }

    public Pedido ler(int id) {
        for(Pedido pedidoAux : this.pedidos) {
            if(pedidoAux.getId() == id) {
                return pedidoAux;
            }

        }
        return null;
    }


    public List<Pedido> lerTudo() {
        return this.pedidos;
    }
}
