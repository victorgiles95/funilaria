package com.victor.funilaria.service;

import com.victor.funilaria.entity.Pedido;
import com.victor.funilaria.entity.PedidoItem;
import com.victor.funilaria.model.PedidoItemModel;
import com.victor.funilaria.model.PedidoModel;
import com.victor.funilaria.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel salvar(PedidoModel pedidoModel) {
        Pedido pedido = modelToEntity(pedidoModel);
        pedido = pedidoRepository.save(pedido);
        return entityToModel(pedido);
    }

    public PedidoModel buscarPorId(Long id) {
        return entityToModel(pedidoRepository.findById(id).get());
    }

    public void deletarPorId(Long id) {
        pedidoRepository.delete(pedidoRepository.findById(id).get());
    }
    private Pedido modelToEntity(PedidoModel pedidoModel) {
        Pedido pedido = new Pedido();

        pedido.setId(pedidoModel.getId());
        pedido.setCliente(ClienteService.modelToEntity(pedidoModel.getCliente()));
        pedido.setValorTotal(pedidoModel.getValorTotal());
        pedido.setPedidoItems(new HashSet<>());

        for (PedidoItemModel itemModel:pedidoModel.getPedidoItems()){
            PedidoItem item = new PedidoItem();
            item.setId(itemModel.getId());
            item.setPedido(pedido);
            item.setQuantidade(itemModel.getQuantidade());
            item.setValorTotal(itemModel.getValorTotal());
            item.setPeca(PecaService.modelToEntity(itemModel.getPeca()));
            pedido.getPedidoItems().add(item);

        }

        return pedido;
    }

    private PedidoModel entityToModel(Pedido pedido) {
        PedidoModel pedidoModel = new PedidoModel();

        pedidoModel.setId(pedido.getId());
        pedidoModel.setCliente(ClienteService.entityToModel(pedido.getCliente()));
        pedidoModel.setValorTotal(pedido.getValorTotal());
        pedidoModel.setPedidoItems(new HashSet<>());

        for (PedidoItem item:pedido.getPedidoItems()){
            PedidoItemModel itemModel = new PedidoItemModel();
            itemModel.setId(item.getId());
            itemModel.setQuantidade(item.getQuantidade());
            itemModel.setValorTotal(item.getValorTotal());
            itemModel.setPeca(PecaService.entityToModel(item.getPeca()));
            pedidoModel.getPedidoItems().add(itemModel);
        }
        return pedidoModel;
    }
}
