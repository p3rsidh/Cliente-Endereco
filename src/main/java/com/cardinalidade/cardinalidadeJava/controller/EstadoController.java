package com.cardinalidade.cardinalidadeJava.controller;

import com.cardinalidade.cardinalidadeJava.model.Estado;
import com.cardinalidade.cardinalidadeJava.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path = "/estados")
    public List<Estado> buscarTodos(){
        return estadoService.buscarTodos();
    }

    @GetMapping(path = "/estados/{codigo}")
    public Optional<Estado> buscarPorId(@PathVariable Long codigo){
        return estadoService.buscarPorId(codigo);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(path = "/estados")
    @ResponseStatus(HttpStatus.CREATED)
    public Estado cadastrar(@RequestBody Estado estado){
        return estadoService.cadastrar(estado);
    }

    @PutMapping(path = "estados/{codigo}")
    public Estado alterarEstado(@RequestBody Estado estado){
        return estadoService.alterar(estado);
    }

    @DeleteMapping(path = "/estados/{codigo}")
    public List<Estado> deletarEstado(@PathVariable Long codigo){
        return estadoService.deletar(codigo);
    }


}
