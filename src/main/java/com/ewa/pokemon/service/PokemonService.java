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

    public Pokemon find(Integer id){
        return pokemonRepo.findPokemonById(id);
    }

    public Pokemon storePokemon(Pokemon pokemon) {
        return pokemonRepo.save(pokemon);
    }

    public void deletePokemon(Integer id){
        pokemonRepo.deletePokemonById(id);
    }

    public Pokemon createPokemon() {
        Pokemon p1 = new Pokemon("Pickachu", 100, "Electric", 4, 34, 100);
        Pokemon p2 = new Pokemon("Rachidzard", 100, "Earth", 9, 80, 15);
        Pokemon p3 = new Pokemon("Fufuka", 100, "Grass", 8, 68, 20);
        Pokemon p4 = new Pokemon("Zemelton", 100, "Water", 4, 50, 32);
        pokemonRepo.save(p1);
        pokemonRepo.save(p2);
        pokemonRepo.save(p3);
        pokemonRepo.save(p4);
        return p1;
    }
}
