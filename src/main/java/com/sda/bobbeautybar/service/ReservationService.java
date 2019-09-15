package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Reservation;
import com.sda.bobbeautybar.repository.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepo;

    public List<Reservation> getAll() {
        return reservationRepo.findAll();
    }

    public Reservation getById(Long id) {
        return reservationRepo.findById(id).get();
    }

    public Reservation save(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

}
