package com.victor.funilaria.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class PedidoItem {

    @Id
    @SequenceGenerator(name = "pedidoItem_id_seq", sequenceName = "pedidoItem_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedidoItem_id_seq")
    private Long id;
    @ManyToOne
    private Peca peca;
    private Long quantidade;
    private BigDecimal valorTotal;
    @ManyToOne
    private Pedido pedido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
