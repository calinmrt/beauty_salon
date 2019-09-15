package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Service,Long> {
}
