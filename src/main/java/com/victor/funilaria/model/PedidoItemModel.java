package com.victor.funilaria.model;

import java.math.BigDecimal;

public class PedidoItemModel {
    private Long id;
    private PecaModel peca;
    private Long quantidade;
    private BigDecimal valorTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PecaModel getPeca() {
        return peca;
    }

    public void setPeca(PecaModel peca) {
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


}
