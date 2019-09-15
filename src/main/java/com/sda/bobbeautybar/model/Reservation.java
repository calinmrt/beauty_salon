package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idReservation;
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
}
