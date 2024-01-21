package com.example.pokemos.impl;


import com.example.pokemos.model.Pokemons;
import com.example.pokemos.repository.PokemonDAO;
import com.example.pokemos.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryPokemomServiceImp implements PokemonService {
    private final PokemonDAO repository;
    @Override
    public List<Pokemons> findAllpokemons() {
        return repository.findAllpokemons();
    }

    @Override
    public Pokemons savePokemon(Pokemons pokemon) {
        return repository.savePokemon(pokemon);
    }

    @Override
    public Pokemons findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Pokemons updatePokemon(Pokemons pokemon) {
        return repository.updatePokemon(pokemon);
    }

    @Override
    public Pokemons deletePokemon(String name) {
        return repository.deletePokemon(name);
    }
}
