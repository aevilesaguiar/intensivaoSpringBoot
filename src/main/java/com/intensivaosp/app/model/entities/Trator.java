package com.intensivaosp.app.model.entities;

public class Trator {

    private String marca;
    private Integer idade;

    public Trator() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Trator{" +
                "marca='" + marca + '\'' +
                ", idade=" + idade +
                '}';
    }
}
