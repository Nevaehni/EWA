package com.ewa.pokemon.service;

import com.ewa.pokemon.model.Pokemon;
import com.ewa.pokemon.model.User;
import com.ewa.pokemon.model.UserPokemon;
import com.ewa.pokemon.repository.UserPokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPokemonService {
    private final UserPokemonRepo userPokemonRepo;

    @Autowired
    public UserPokemonService(UserPokemonRepo userPokemonRepo) {
        this.userPokemonRepo = userPokemonRepo;
    }

    public void save(UserPokemon userPokemon){
        userPokemonRepo.save(userPokemon);
    }

    public void registerPokemonToUser(Pokemon pokemon, User user) {
        UserPokemon newUserPokemon = new UserPokemon(user, pokemon);
        save(newUserPokemon);
    }
}
