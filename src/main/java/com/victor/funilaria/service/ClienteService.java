package com.victor.funilaria.service;

import com.victor.funilaria.entity.Cliente;
import com.victor.funilaria.model.ClienteModel;
import com.victor.funilaria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteModel salvar(ClienteModel clienteModel) {
        Cliente cliente = modelToEntity(clienteModel);
        cliente = clienteRepository.save(cliente);
        return entityToModel(cliente);
    }

    public static Cliente modelToEntity(ClienteModel clienteModel) {
        Cliente cliente = new Cliente();

        cliente.setId(clienteModel.getId());
        cliente.setNome(clienteModel.getNome());

        return cliente;
    }

    public static ClienteModel entityToModel(Cliente cliente) {
        ClienteModel clienteModel = new ClienteModel();

        clienteModel.setId(cliente.getId());
        clienteModel.setNome(cliente.getNome());

        return clienteModel;
    }
}