package com.victor.funilaria.service;

import com.victor.funilaria.entity.Peca;
import com.victor.funilaria.model.PecaModel;
import com.victor.funilaria.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PecaService {

    @Autowired
    private PecaRepository pecaRepository;

    public PecaModel salvar(PecaModel pecaModel) {
        Peca peca = modelToEntity(pecaModel);
        peca = pecaRepository.save(peca);
        return entityToModel(peca);
    }

    public PecaModel buscarPorId(Long id) {
        return entityToModel(pecaRepository.findById(id).get());
    }

    public void deletarPorId(Long id) {
        pecaRepository.delete(pecaRepository.findById(id).get());
    }
    private Peca modelToEntity(PecaModel pecaModel) {
        Peca peca = new Peca();

        peca.setId(pecaModel.getId());
        peca.setNome(pecaModel.getNome());
        peca.setPrecoCompra(pecaModel.getPrecoCompra());
        peca.setPrecoVenda(pecaModel.getPrecoVenda());

        return peca;
    }

    private PecaModel entityToModel(Peca peca) {
        PecaModel pecaModel = new PecaModel();

        pecaModel.setId(peca.getId());
        pecaModel.setNome(peca.getNome());
        pecaModel.setPrecoCompra(peca.getPrecoCompra());
        pecaModel.setPrecoVenda(peca.getPrecoVenda());

        return pecaModel;
    }

}
