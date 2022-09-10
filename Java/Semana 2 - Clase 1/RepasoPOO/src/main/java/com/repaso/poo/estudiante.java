package com.repaso.poo;

public class estudiante extends Persona{

    //Toda clase tiene un cosntructor vacio
    // Este es el constructor de la clase
    public estudiante(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
    }


    public String Nombres(){
        return getNombre() + " " + getApellido();
    }
}
