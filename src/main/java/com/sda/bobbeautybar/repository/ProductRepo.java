package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
