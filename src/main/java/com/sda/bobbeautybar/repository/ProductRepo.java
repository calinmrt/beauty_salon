package com.sda.bobbeautybar.repository;

import com.sda.bobbeautybar.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
    Page<Product> findByProductNameContaining(String productName, Pageable pageable);
    Page<Product> findAll(Pageable pageable);
}
