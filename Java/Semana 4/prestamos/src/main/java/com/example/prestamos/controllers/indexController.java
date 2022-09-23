package com.example.prestamos.controllers;

import com.example.prestamos.entities.User;
import com.example.prestamos.services.Response;
import com.example.prestamos.services.userService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;


@RestController
public class indexController {

    private userService UserService;

    public indexController(userService service){
        this.UserService = service;

    }
    @RequestMapping("/")
    public String index(){
        return "Hello.";
    }

    @RequestMapping("usuarios")
    public ArrayList<User> getusuarios(){
        return this.UserService.selectAll();
    }

    @PostMapping("create")
    public Response createuser(@RequestBody User request){
        return this.UserService.createUser(request);

    }


}
