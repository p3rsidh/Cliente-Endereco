package com.cardinalidade.cardinalidadeJava.service;

import com.cardinalidade.cardinalidadeJava.model.Estado;
import com.cardinalidade.cardinalidadeJava.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos(){
        return estadoRepository.findAll();
    }

    public Optional<Estado> buscarPorId(Long id){
        return estadoRepository.findById(id);
    }

    public Estado cadastrar(Estado estado){
        return estadoRepository.save(estado);
    }

    public Estado alterar(Estado estado){
       return estadoRepository.save(estado);
    }

    public List<Estado> deletar(Long id){
        estadoRepository.deleteById(id);
        return buscarTodos();
    }
}
