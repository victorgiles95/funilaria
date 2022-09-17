package com.victor.funilaria.model;

import java.math.BigDecimal;
import java.util.Set;

public class PedidoModel {
    private Long id;
    private ClienteModel cliente;
    private BigDecimal valorTotal;
    private Set<PedidoItemModel> pedidoItems;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Set<PedidoItemModel> getPedidoItems() {
        return pedidoItems;
    }

    public void setPedidoItems(Set<PedidoItemModel> pedidoItems) {
        this.pedidoItems = pedidoItems;
    }
}
