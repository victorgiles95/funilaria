package com.victor.funilaria.controller;

import com.victor.funilaria.model.ClienteModel;
import com.victor.funilaria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteModel salvar(@RequestBody ClienteModel clienteModel) {
        return clienteService.salvar(clienteModel);

    }
}