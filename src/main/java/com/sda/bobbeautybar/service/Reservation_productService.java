package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Reservation_products;
import com.sda.bobbeautybar.repository.Reservation_productRepo;
import org.springframework.stereotype.Service;

@Service
public class Reservation_productService {
    private Reservation_productRepo reservation_productRepo;
    public Reservation_products save(Reservation_products reservationproducts) {
        return reservation_productRepo.save(reservationproducts);
    }
}
