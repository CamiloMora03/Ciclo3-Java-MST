package com.example.prestamos.services;

import com.example.prestamos.entities.User;
import com.example.prestamos.repository.IUserRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class userService {

    private final IUserRepository userRepository;

    public userService(IUserRepository rep){
        this.userRepository = rep;
    }
    public ArrayList<User> selectAll(){
        return (ArrayList<User>) this.userRepository.findAll();
    }


    public Response createUser(User data){
        Response response = new Response();
        this.userRepository.save(data);
        response.setCode(200);
        response.setMessage("Usuario registrado con exito.");
        return response;
    }
}
