package com.example.authservice.controllers;

import com.example.authservice.dto.UserDTO;
import com.example.authservice.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/services/controller")
public class AuthController {
    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;
    @PostMapping("/user")
    public Long createUser(@RequestBody UserDTO user){
        Long res =  userDetailsServiceImpl.saveDto(user);
        return res;
    }
    @GetMapping("")
    public String stuff(){
        return "Woo";
    }

}
