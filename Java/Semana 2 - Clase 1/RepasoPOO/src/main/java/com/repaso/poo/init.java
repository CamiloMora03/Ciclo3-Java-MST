package com.repaso.poo;

public class init {

    public static void main(String[] args) {

        // Creo una instancia de la clase zapato

        zapato miZapato = new zapato();
        miZapato.setTalla(34);
        miZapato.setColor("Rojo");
        miZapato.setMarca("Nike");

        zapato miZapato2 = new zapato();
        miZapato2.setMarca("Adidas");
        miZapato2.setColor("Azul");
        miZapato2.setTalla(40);
/*
        System.out.println("Talla Zapato1: " + miZapato.getTalla());
        System.out.println("Color Zapato1: " + miZapato.getColor());
        System.out.println("Marca Zapato1: " + miZapato.getMarca());
        System.out.println("Talla Zapato2: " + miZapato2.getTalla());
        System.out.println("Color Zapato2: " + miZapato2.getColor());
        System.out.println("Marca Zapato2: " + miZapato2.getMarca());

*/
        estudiante addStudent = new estudiante("Juan", "C");
        Persona addPerson = new Persona();

        System.out.println(addStudent.Nombres());
    }
}
