package com.ewa.pokemon.model;

import javax.persistence.*;

@Entity(name = "Status")
@Table(name = "States")
public class Status {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(nullable = false)
    private String state;
}
