package com.intensivaosp.app.controller;

import com.intensivaosp.app.model.Contato;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class ContatoController {

    @PostMapping
    public Contato post(@RequestBody Contato contato){
        System.out.println(contato);
        return contato;
    }

}
