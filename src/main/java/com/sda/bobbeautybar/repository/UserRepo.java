package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Role;
import com.sda.bobbeautybar.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User,Long> {
    Page<User> findAllByRoles(Role role, Pageable of);

    Page<User> findAllByRolesAndUserNameContaining(Role role,String userName, Pageable of);
}
