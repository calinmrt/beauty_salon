package com.sda.bobbeautybar.service;

import com.sda.bobbeautybar.model.Service;
import com.sda.bobbeautybar.repository.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {
    @Autowired
    private ServiceRepo serviceRepo;

    public List<Service> getAll() {
        return serviceRepo.findAll();
    }

    public Service getById(Long id) {
        return serviceRepo.findById(id).get();
    }

    public Service save(Service service) {
        return serviceRepo.save(service);
    }

    public void delete(Long id) {
        serviceRepo.deleteById(id);
    }
}


