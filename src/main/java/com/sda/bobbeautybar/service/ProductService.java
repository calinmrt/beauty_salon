package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Product;
import com.sda.bobbeautybar.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
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

}
