package com.victor.funilaria.controller;

import com.victor.funilaria.model.PecaModel;
import com.victor.funilaria.service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/peca")
public class PecaController {
    @Autowired
    private PecaService pecaService;

    @PostMapping
    public PecaModel salvar(@RequestBody PecaModel pecaModel) {
        return pecaService.salvar(pecaModel);

    }

    @GetMapping("/{id}")
    public PecaModel burcarPorId (@PathVariable("id") Long id){
        return pecaService.buscarPorId(id);

    }

    @DeleteMapping("/{id}")
    public String deletarPorId (@PathVariable("id") Long id){
        pecaService.deletarPorId(id);
        return "Peça "+id+" deletado com sucesso";
    }
}
