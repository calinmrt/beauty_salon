package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Reservation_products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reservation_productRepo extends JpaRepository<Reservation_products,Long> {
}
