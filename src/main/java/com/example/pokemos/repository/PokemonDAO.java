package com.example.pokemos.repository;

import com.example.pokemos.model.Pokemons;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class PokemonDAO {
    private final List<Pokemons> POKEMONS = new ArrayList<>();


    public List<Pokemons> findAllpokemons() {
        return POKEMONS;
    }
    public Pokemons savePokemon(Pokemons pokemon) {
        POKEMONS.add(pokemon);
        return pokemon;
    }


    public Pokemons findByName(String name) {
        return POKEMONS.stream()
                .filter(element -> element.getName().equals(name))
                .findFirst()
                .orElse(null);
    }


    public Pokemons updatePokemon(Pokemons pokemon) {
        var pokemonIndex = IntStream.range(0, POKEMONS.size())
                .filter(index -> POKEMONS.get(index).getName().equals(pokemon.getName()))
                .findFirst()
                .orElse(-1);
        if (pokemonIndex > -1) {
            POKEMONS.set(pokemonIndex, pokemon);
            return pokemon;
        }
        return null;
    }


    public Pokemons deletePokemon(String name) {
        var pokemon = findByName(name);
        if (pokemon != null) {
            POKEMONS.remove(pokemon);
        }
        return null;
    }
}
