package com.intensivaosp.app.controller;

import com.intensivaosp.app.model.entities.Trator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trator")
public class TratorController {

    //http://localhost:8080/trator?marca=lamborgini&idade=20

    @GetMapping
    public Trator get(@RequestParam("marca") String marca, @RequestParam("idade") int idade){

        Trator trator = new Trator();
        trator.setMarca(marca);
        trator.setIdade(idade);

        return trator;

    }
     //http://localhost:8080/trator/sp?marca=cartepillar&idade=36
    //java Beans cria o objeto
    @GetMapping("/sp") //ele devolve a biblioteca do spring boot que é o json
    public Trator get1(Trator trator){

        return trator;

    }
}
