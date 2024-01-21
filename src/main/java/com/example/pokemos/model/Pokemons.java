package com.example.pokemos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pokemons{
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String type;
    private int hp;
    private int attack;

}
