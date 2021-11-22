package com.ewa.pokemon.model;

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
            mappedBy = "trainer"
    )
    private List<TrainerPokemon> pokemons = new ArrayList<>();

    public Trainer() {}


}
