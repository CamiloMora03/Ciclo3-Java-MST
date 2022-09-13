package com.example.mvcapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistasController {

    @GetMapping("mivista")
    public String mivista(){
        return "mivista";
    }
}
