package com.example.pokemos.impl;

import com.example.pokemos.model.Pokemons;
import com.example.pokemos.repository.PokemonRepository;
import com.example.pokemos.service.PokemonService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class PokemonServiceImpl  implements PokemonService {

    private final PokemonRepository repository;
    @Override
    public List<Pokemons> findAllpokemons() {
        return repository.findAll();
    }

    @Override
    public Pokemons savePokemon(Pokemons pokemon) {
        return repository.save(pokemon);
    }

    @Override
    public Pokemons findByName(String name) {
        return repository.findPokemonsByName(name);
    }

    @Override
    public Pokemons updatePokemon(Pokemons pokemon) {
        return repository.save(pokemon);
    }

    @Override
    @Transactional
    public Pokemons deletePokemon(String name) {
        repository.deleteByName(name);
        return null;
    }
}
