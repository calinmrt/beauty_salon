package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Role;
import com.sda.bobbeautybar.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;

    public Role getById(Integer idRole){
        return roleRepo.getOne(idRole);
    }
}
