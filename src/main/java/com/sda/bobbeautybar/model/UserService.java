package com.sda.bobbeautybar.model;

import com.sda.bobbeautybar.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User getById(Long id) {
        return userRepo.findById(id).get();
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public void delete(Long id) {
        userRepo.deleteById(id);


    }


}
