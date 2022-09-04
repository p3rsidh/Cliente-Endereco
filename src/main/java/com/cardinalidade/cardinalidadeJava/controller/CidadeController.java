package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.Cidade;
import com.cardinalidade.cardinalidadeJava.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping(path = "/cidades")
    public List<Cidade> buscarTodos(){
       return cidadeService.buscarTodas();
    }

    @GetMapping(path = "/cidades/{codigo}")
    public Optional buscarPorId(@PathVariable Long codigo){
        return cidadeService.buscarPorId(codigo);
    }

    @PostMapping(path = "/cidades")
    public Cidade cadastrarCidade(@RequestBody Cidade cidade){
        return cidadeService.cadastrar(cidade);
    }

    @PutMapping(path = "/cidade/{codigo}")
    public Cidade alterarCidade(@RequestBody Cidade cidade){
        return cidadeService.alterar(cidade);
    }

    @DeleteMapping(path = "/cidade/{codigo}")
    public List<Cidade> deletarCidade(@PathVariable Long codigo){
        return cidadeService.deletar(codigo);
    }
}
