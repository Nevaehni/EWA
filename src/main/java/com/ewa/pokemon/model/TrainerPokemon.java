package com.ewa.pokemon.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "TrainerPokemon")
@Table(name = "trainer_pokemon")
public class TrainerPokemon {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = Trainer.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @ManyToOne(targetEntity = Trainer.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;

    @OneToOne(targetEntity = Trainer.class, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "status_id")
    private Status status;

    @Column(nullable = false)
    private Long exp;

    @Column(nullable = false)
    private double health;
}
