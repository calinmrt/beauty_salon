package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
