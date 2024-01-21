package com.example.pokemos.repository;

import com.example.pokemos.model.Pokemons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemons, Long> {
    void deleteByName(String name);
    Pokemons findPokemonsByName(String name);
}
