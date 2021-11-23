package com.ewa.pokemon.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Pokemon")
@Table(name = "pokemon")
public class Pokemon implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double health;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int rarity;

    @Column(nullable = false)
    private int defense;

    @Column(nullable = false)
    private int speed;

    public Pokemon(String name, double health, String type, int rarity, int defense, int speed) {
        this.name = name;
        this.health = health;
        this.type = type;
        this.rarity = rarity;
        this.defense = defense;
        this.speed = speed;
    }

    public Pokemon() {

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

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
