package com.victor.funilaria.controller;

import com.victor.funilaria.model.PedidoModel;
import com.victor.funilaria.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")

public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public PedidoModel salvar(@RequestBody PedidoModel pedidoModel) {
        return pedidoService.salvar(pedidoModel);

    }

    @GetMapping("/{id}")
    public PedidoModel burcarPorId (@PathVariable("id") Long id){
        return pedidoService.buscarPorId(id);

    }

    @DeleteMapping("/{id}")
    public String deletarPorId (@PathVariable("id") Long id){
        pedidoService.deletarPorId(id);
        return "Pedido "+id+" deletado com sucesso";
    }
}
