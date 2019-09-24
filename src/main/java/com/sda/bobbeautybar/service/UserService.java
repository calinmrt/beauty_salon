package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Role;
import com.sda.bobbeautybar.model.User;
import com.sda.bobbeautybar.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleService roleService;


    public Page<User> getAll(Pageable of, int idRole) {
        Role role = roleService.getById(idRole);
        return userRepo.findAllByRoles(role, of);
    }

    public User getById(Long id) {
        return userRepo.findById(id).get();
    }

    public User save(User user, int idRole) {
        Role role = roleService.getById(idRole);
        List<Role> roles = user.getRoles();
        if (roles.isEmpty()) roles.add(role);
        else {
            if (!roles.get(0).equals(role)) roles.set(0, role);
        }
        return userRepo.save(user);
    }

    public Page<User> findByName(Pageable of, String userName, int idRole) {
        Role role = roleService.getById(idRole);
        return userRepo.findAllByRolesAndUserNameContaining(role,userName, of);
    }

}
