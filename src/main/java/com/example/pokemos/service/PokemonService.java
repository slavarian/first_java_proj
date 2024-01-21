package com.example.pokemos.service;

import com.example.pokemos.model.Pokemons;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PokemonService {
    List<Pokemons> findAllpokemons();

    Pokemons savePokemon(Pokemons pokemon);
    Pokemons findByName(String name);
    Pokemons updatePokemon(Pokemons pokemon);
    Pokemons deletePokemon(String name);

}
