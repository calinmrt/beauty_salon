package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Role;
import com.sda.bobbeautybar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Long> {
    List<User> findAllByRoles(Role role);

}
