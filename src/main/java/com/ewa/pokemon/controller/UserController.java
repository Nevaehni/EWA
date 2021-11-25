package com.ewa.pokemon.controller;

import com.ewa.pokemon.model.User;
import com.ewa.pokemon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public ResponseEntity<List<User>> getUsers(){
        userService.createUser();
        return ResponseEntity.ok().body(userService.findAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        userService.createUser();
        return ResponseEntity.ok().body(userService.find(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> getUser(@RequestParam User user){
        userService.storeUser(user);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("delete")
    public void destroy(){

    }
}