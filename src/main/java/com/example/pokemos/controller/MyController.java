package com.example.pokemos.controller;

import com.example.pokemos.model.Pokemons;
import com.example.pokemos.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/pokemons")
public class MyController {

    private final PokemonService service;

    @GetMapping
    public List<Pokemons> findAllpokemons(){
        return service.findAllpokemons();
    }

    @PostMapping("save_pokemon")
    public String savePokemon(@RequestBody Pokemons pokemon) {
        service.savePokemon(pokemon);
        return "pokemon "+ pokemon.getName() + " created!";
    }

    @GetMapping("/{name}")
    public Pokemons findByName(@PathVariable String name) {
        return  service.findByName(name);
    }

    @PutMapping("update_pokemon")
    public Pokemons updatePokemon(@RequestBody Pokemons pokemon) {
        return service.updatePokemon(pokemon);
    }

    @DeleteMapping("/delete/{name}")
    public void deletePokemon(@PathVariable String name){
        service.deletePokemon(name);
    }

}
