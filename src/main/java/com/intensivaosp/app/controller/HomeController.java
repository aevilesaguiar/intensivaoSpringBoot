package com.intensivaosp.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String olaMundo(){
        return "Olá Mundo!";
    }

    //http://localhost:8080/parametro?texto=Aeviles

    @GetMapping("parametro")
    public String parametro(@RequestParam("texto") String texto){

        return texto;
    }


    //http://localhost:8080/soma?a=1&b=2
    @GetMapping("soma")
    public int endereco(@RequestParam ("a") int a, @RequestParam("b") int b){
        return a+b;
    }

//http://localhost:8080/subtracao?a=1&b=2
    @GetMapping("subtracao")
    public Integer subtracao(@RequestParam (value = "a", required = false) Integer a, @RequestParam(value = "b", required = false) Integer b){

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();
        if(b==null){
            return a;
        }else if(a==null){
            return b;
        }
        else {

            return a - b;
        }
    }
//http://localhost:8080/dados?nome=Maria&idade=17
    @GetMapping("dados")
    public String dados(@RequestParam ("nome") String nome,@RequestParam ("idade") Integer idade) {

        if (idade < 18 || idade > 65) {
            return nome + ", " + idade + " menor idade ou não pode dirigir";


        } else if (idade >= 18) {
            return nome + ", " + idade + " maior de idade";
        }else{
            return "informe um valor correto";
        }
    }

    //essa forma é a mais usada
    //http://localhost:8080/path/multiplicacao/a/5/b/6
    @GetMapping("/path/multiplicacao/a/{a}/b/{b}")
    public Integer multiplicacao(@PathVariable("a") Integer a, @PathVariable("b") Integer b){

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();
        if(b==null){
            return a;
        }else if(a==null){
            return b;
        }
        else {

            return a * b;
        }
    }




}
