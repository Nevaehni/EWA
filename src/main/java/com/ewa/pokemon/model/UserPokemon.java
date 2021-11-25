package com.ewa.pokemon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "UserPokemon")
@Table(name = "user_pokemon")
public class UserPokemon {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "status_id")
    private Status status;

    @Column(nullable = false)
    private Long exp;

    @Column(nullable = false)
    private double health;
}
