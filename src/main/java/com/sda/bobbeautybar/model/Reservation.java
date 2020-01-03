package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDateTime dateTime;
    private boolean confirmed;
    @ManyToOne
    @JoinColumn(name = "idWorker", nullable = false)
    private User worker;
    @ManyToOne
    @JoinColumn(name = "idClient", nullable = false)
    private User client;
    @ManyToOne
    @JoinColumn(name = "idService", nullable = false)
    private Service service;
    @OneToMany(mappedBy="reservation")
    List<Reservation_products> reservationProducts = new ArrayList<>();
}
