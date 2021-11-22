package com.ewa.pokemon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Pokemon implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private double health;
    private String type;
    private int rarity;
    private int defense;
    private int speed;
}
