package com.ewa.pokemon.model;

import javax.persistence.*;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
