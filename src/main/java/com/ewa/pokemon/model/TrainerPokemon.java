package com.ewa.pokemon.model;

import javax.persistence.*;

@Entity(name = "UserPokemon")
@Table(name = "user_pokemon")
public class TrainerPokemon {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    private Long exp;
    private double health;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
