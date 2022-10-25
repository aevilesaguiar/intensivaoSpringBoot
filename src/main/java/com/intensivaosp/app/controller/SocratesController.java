package com.intensivaosp.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("socrates")
public class SocratesController {

    private String[] frases = {
            "Só sei que nada sei",
            "Conece-te a ti mesmo e conhecerás o universo e os deuses",
            "A vida irrefletida não vale a pena ser vivida",
            "Ninguém faz o mal voluntariamente"
    };

    //http://localhost:8080/socrates?palavra=mac
    //http://localhost:8080/socrates?palavra=ti

    @GetMapping
    public String get(@RequestParam("palavra") String palavra){
        System.out.println("GET");
        return frase(palavra);
    }

    @PostMapping
    public String post(@RequestParam("palavra") String palavra){
        System.out.println("POST");
        return frase(palavra);
    }


    public String frase(String palavra){
        for (String frase: frases
             ) {
            if(frase.contains(palavra)){
                return frase;
            }


        }
        return "Nada!";
    }
}
