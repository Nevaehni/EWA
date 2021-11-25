package com.ewa.pokemon.repository;

import com.ewa.pokemon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    void deleteUserById(Long id);

    User findUserById(Long id);

    User findByEmail(String email);
}
