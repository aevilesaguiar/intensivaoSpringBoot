package com.intensivaosp.app.service;

import com.intensivaosp.app.model.entities.Contato;
import com.intensivaosp.app.model.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public Contato salvar(Contato contato){
        return repository.salvar(contato);
    }

    public boolean alterar(String nome, Contato contato){
        return repository.alterar(nome,contato);
    }

    public Contato findByName(String nome){
        return repository.findByName(nome);
    }

    public List<Contato> findAll(Contato contato){
        return repository.findAll();
    }

    public boolean excluir(String nome){
        return repository.excluir(nome);
    }

}
