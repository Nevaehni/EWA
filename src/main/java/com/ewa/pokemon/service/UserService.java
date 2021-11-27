package com.ewa.pokemon.service;

import com.ewa.pokemon.model.User;
import com.ewa.pokemon.repository.UserPokemonRepo;
import com.ewa.pokemon.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo, UserPokemonRepo userPokemonRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User find(Integer id){
        return userRepo.findUserById(id);
    }

    public User storeUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Integer id){
        userRepo.deleteUserById(id);
    }

    public User createUser() {
        User user = new User("Seba", "Seba's nickname", "seb@seb.com", "netherlands", "m", "password");
        User user2 = new User("user2", "nickseb", "u@u.com", "taiwan", "f", "assword");
        userRepo.save(user);
        userRepo.save(user2);
        return user;
    }
}