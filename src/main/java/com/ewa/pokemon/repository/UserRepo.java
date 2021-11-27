package com.ewa.pokemon.repository;

import com.ewa.pokemon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findUserById(Integer id);

    void deleteUserById(Integer id);
}
