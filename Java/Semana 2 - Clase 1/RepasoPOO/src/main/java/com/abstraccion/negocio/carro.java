package com.abstraccion.negocio;

public class carro extends vehiculo {
    public carro() {
    }

    public carro(String marca, String color) {
        super(marca, color);
    }

    @Override
    public void Acelerar(){
        System.out.println("Acelera el carro");
    }
}
