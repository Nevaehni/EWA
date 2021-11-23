package com.ewa.pokemon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Trainer")
@Table(name = "trainer")
public class Trainer implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String country;

    @Column(nullable = false, unique = true)
    private String gender;

    @Column(nullable = false)
    private String password;

    @Column(columnDefinition = "int(11) default '200'")
    private int gold;

    @Column(columnDefinition = "int(11) default '1000'")
    private int rank;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "trainer",
            fetch = FetchType.EAGER
    )
    private List<TrainerPokemon> pokemons = new ArrayList<>();;

    public Trainer() {}

    public Trainer(String name, String nickname, String email, String country, String gender, String password, int gold, int rank, List<TrainerPokemon> pokemons) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.country = country;
        this.gender = gender;
        this.password = password;
        this.gold = gold;
        this.rank = rank;
        this.pokemons = pokemons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<TrainerPokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<TrainerPokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
