package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
