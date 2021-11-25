package com.ewa.pokemon.service;

import com.ewa.pokemon.model.User;
import com.ewa.pokemon.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User find(Long id){
        return userRepo.findUserById(id);
    }

    public User storeUser(User user) {
        return userRepo.save(user);
    }

    public void createUser() {
        User user = new User("seb", "nickseb", "seb@seb.com", "netherlands", "m", "password");
        userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}