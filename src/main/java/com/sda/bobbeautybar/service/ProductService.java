package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Product;
import com.sda.bobbeautybar.repository.ProductRepo;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Page<Product> getAll(Pageable of) {
        return productRepo.findAll(of);
    }

    public Product getById(Long id) {
        return productRepo.findById(id).get();
    }

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public void delete(Long id) {
        productRepo.deleteById(id);
    }


    public Page<Product> findByName(Pageable of, String productName) {
        return productRepo.findByProductNameContaining(productName,of);
    }
}

