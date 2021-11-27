package com.ewa.pokemon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "UserPokemon")
@Table(name = "user_pokemon")
public class UserPokemon {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(targetEntity = Pokemon.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    @OneToOne(targetEntity = Status.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id")
    private Status status;

    @Column(nullable = false)
    private int exp;

    @Column(nullable = false)
    private int health;

    public UserPokemon(User user, Pokemon pokemon) {
        this.user = user;
        this.pokemon = pokemon;
        this.exp = 0;
    }

    public UserPokemon() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
