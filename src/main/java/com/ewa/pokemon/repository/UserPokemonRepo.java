package com.ewa.pokemon.repository;

import com.ewa.pokemon.model.UserPokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPokemonRepo extends JpaRepository<UserPokemon, Integer> {
}
