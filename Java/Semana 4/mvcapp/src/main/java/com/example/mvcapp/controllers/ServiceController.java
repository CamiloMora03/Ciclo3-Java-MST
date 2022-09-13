package com.example.mvcapp.controllers;

import com.example.mvcapp.services.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ServiceController {

    @RequestMapping(value = "index")
    public String saludo(){
        return ("Hello, world");
    }

    @RequestMapping(value = "Usuarios")
    public List<Usuario> getUsuarios(){
        Usuario usuario1 = new Usuario();
        usuario1.setApellido("Mora");
        usuario1.setNombre("Camilo");

        Usuario usuario2 = new Usuario();
        usuario2.setApellido("Hernandez");
        usuario2.setNombre("Hernando");
        ArrayList nuevaLista = new ArrayList<Usuario>();
        nuevaLista.add(usuario1);
        nuevaLista.add(usuario2);
        return nuevaLista;

    }
}
