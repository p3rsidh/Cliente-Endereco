package com.cardinalidade.cardinalidadeJava.service;

import com.cardinalidade.cardinalidadeJava.model.Cidade;
import com.cardinalidade.cardinalidadeJava.repositories.CidadeReposirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    private CidadeReposirory cidadeReposirory;

    public List<Cidade> buscarTodas(){
        return cidadeReposirory.findAll();
    }

    public Optional buscarPorId(Long id){
        return cidadeReposirory.findById(id);
    }

    public Cidade cadastrar(Cidade cidade){
        return cidadeReposirory.save(cidade);
    }

    public Cidade alterar(Cidade cidade){
        return cidadeReposirory.save(cidade);
    }

    public List<Cidade> deletar(Long id){
        cidadeReposirory.deleteById(id);
        return buscarTodas();
    }
}
