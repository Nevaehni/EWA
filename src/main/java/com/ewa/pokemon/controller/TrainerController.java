package com.ewa.pokemon.controller;

import com.ewa.pokemon.model.Trainer;
import com.ewa.pokemon.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("")
    public List<Trainer> getStudents(){
        return trainerService.findAllTrainers();
    }

    @GetMapping("all")
    public String index(){
        return trainerService.findAllTrainers().toString();
    }

    @PostMapping("store")
    @ResponseStatus(HttpStatus.CREATED)
    public String store(@RequestBody Trainer newTrainer){
        trainerService.storeTrainer(newTrainer);
        return "This route stores a new trainer";
    }

    @DeleteMapping("delete")
    public void destroy(){

    }
}