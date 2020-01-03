package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idService;
    private String serviceName;
    private double servicePrice;
    private int duration;
    @ManyToOne
    @JoinColumn(name ="idUser", nullable = false)
    private User user;

    @OneToMany(mappedBy = "service")
    List<Reservation> reservations=new ArrayList<>();

    @Override
    public String toString() {
        return "Service{" +
                "idService=" + idService +
                ", serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", duration=" + duration +
                ", user=" + user +
                '}';
    }
}
