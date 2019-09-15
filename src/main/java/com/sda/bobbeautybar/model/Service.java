package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idService;
    private String serviceName;
    private double servicePrice;
    private int duration;
    @ManyToOne
    @JoinColumn(name ="idUser", nullable = false)
    private User user;
    @OneToMany(mappedBy="service")
    List<Service_product> serviceProducts = new ArrayList<>();
    @OneToMany(mappedBy = "service")
    List<Reservation> reservations=new ArrayList<>();
}
