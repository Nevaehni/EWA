package com.ewa.pokemon.controller;

import com.ewa.pokemon.model.Pokemon;
import com.ewa.pokemon.model.User;
import com.ewa.pokemon.model.UserPokemon;
import com.ewa.pokemon.service.PokemonService;
import com.ewa.pokemon.service.UserPokemonService;
import com.ewa.pokemon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {
    private final UserService userService;
    private final PokemonService pokemonService;
    private final UserPokemonService userPokemonService;

    @Autowired
    public UserController(UserService userService, PokemonService pokemonService, UserPokemonService userPokemonService) {
        this.userService = userService;
        this.pokemonService = pokemonService;
        this.userPokemonService = userPokemonService;


        //For testing  only, create 4 pokemons and add them to user 1.
        Pokemon pokemon = pokemonService.createPokemon();

        User user = userService.createUser();

        userPokemonService.registerPokemonToUser(pokemon, userService.find(2));

        userPokemonService.registerPokemonToUser(pokemon, user);
        userPokemonService.registerPokemonToUser(pokemonService.find(2), user);
        userPokemonService.registerPokemonToUser(pokemonService.find(3), user);
        userPokemonService.registerPokemonToUser(pokemonService.find(4), user);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.findAllUsers());
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return ResponseEntity.ok().body(userService.find(id));
    }

    @GetMapping("{id}/pokemons")
    public ResponseEntity<List<UserPokemon>> getUserPokemons(@PathVariable Integer id){
        return ResponseEntity.ok().body(userService.find(id).getPokemons());
    }
}