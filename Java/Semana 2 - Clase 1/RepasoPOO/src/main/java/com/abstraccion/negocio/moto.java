package com.abstraccion.negocio;

public class moto extends vehiculo{

    public moto() {
    }

    public moto(String marca, String color) {
        super(marca, color);
    }

    @Override
    public void Acelerar(){
        System.out.println("Acelera la moto");
    }
}
