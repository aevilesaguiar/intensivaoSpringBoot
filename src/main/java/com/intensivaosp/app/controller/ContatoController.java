package com.intensivaosp.app.controller;

import com.intensivaosp.app.model.entities.Contato;
import com.intensivaosp.app.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contato")
public class ContatoController {

    @Autowired
    private ContatoService service;

    private Contato contato;

    @PostMapping
    public Contato post(@RequestBody Contato contato) {
        System.out.println(contato);
        service.salvar(contato);
        return contato;
    }
    //ele pega a lista e procura se tiver o contato que eu estou procurando ele altera, se ele achar o contato ele envia verdadeiro, senão envia falso
  @PutMapping("nome/{nome}")
    public boolean alterar(@PathVariable("nome") String nome, @RequestBody Contato contato){
        System.out.println("Alterar "+nome + " "+ contato);

        return service.alterar(nome, contato);
    }

    @GetMapping("nome/{nome}")
    public Contato findByName(@PathVariable ("nome") String nome){
        System.out.println("Listar um"+nome);

        return service.findByName(nome);
    }

    @GetMapping
    public List<Contato> findAll(){
        return service.findAll(contato);
    }

    @DeleteMapping("{nome}")
    public boolean excluir(@PathVariable ("nome") String nome){
        System.out.println("Excluir: "+nome);

       return service.excluir(nome);
    }




}
