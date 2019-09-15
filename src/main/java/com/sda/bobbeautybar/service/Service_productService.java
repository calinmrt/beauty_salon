package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Reservation;
import com.sda.bobbeautybar.model.Service_product;
import com.sda.bobbeautybar.repository.Service_productRepo;
import org.springframework.stereotype.Service;

@Service
public class Service_productService {
    private Service_productRepo service_productRepo;
    public Service_product save(Service_product service_product) {
        return service_productRepo.save(service_product);
    }
}
