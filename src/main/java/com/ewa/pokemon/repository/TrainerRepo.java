package com.ewa.pokemon.repository;

import com.ewa.pokemon.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepo extends JpaRepository<Trainer, Long> {
    void deleteTrainerById(Long id);

    Trainer findTrainerById(Long id);
}
