package com.ewa.pokemon.controller;

import com.ewa.pokemon.model.Trainer;
import com.ewa.pokemon.service.TrainerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/")
    public String index(){
        return "UseController";
    }

    @PostMapping("store")
    public String store(@RequestBody Trainer newTrainer){
        trainerService.storeTrainer(newTrainer);
        return "Done";
    }

    @DeleteMapping("delete")
    public void destroy(){

    }
}