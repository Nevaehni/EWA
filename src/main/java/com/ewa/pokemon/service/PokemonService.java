package com.ewa.pokemon.service;

import com.ewa.pokemon.model.Pokemon;
import com.ewa.pokemon.repository.PokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {
    private final PokemonRepo pokemonRepo;

    @Autowired
    public PokemonService(PokemonRepo pokemonRepo) {
        this.pokemonRepo = pokemonRepo;
    }

    public List<Pokemon> findAllPokemons(){
        return pokemonRepo.findAll();
    }

    public Pokemon find(Long id){
        return pokemonRepo.findPokemonById(id);
    }

    public Pokemon storePokemon(Pokemon pokemon) {
        return pokemonRepo.save(pokemon);
    }

    public void deletePokemon(Long id){
        pokemonRepo.deletePokemonById(id);
    }
}
