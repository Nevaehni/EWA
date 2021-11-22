package com.ewa.pokemon.service;

import com.ewa.pokemon.model.Trainer;
import com.ewa.pokemon.repository.TrainerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {
    private final TrainerRepo trainerRepo;

    @Autowired
    public TrainerService(TrainerRepo trainerRepo) {
        this.trainerRepo = trainerRepo;
    }

    public List<Trainer> findAllTrainers(){
        return trainerRepo.findAll();
    }

    public Trainer find(Long id){
        return trainerRepo.findTrainerById(id);
    }

    public Trainer storeTrainer(Trainer trainer) {
        return trainerRepo.save(trainer);
    }

    public void deleteUser(Long id){
        trainerRepo.deleteTrainerById(id);
    }
}