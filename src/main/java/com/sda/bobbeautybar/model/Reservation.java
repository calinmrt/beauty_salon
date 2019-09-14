package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue
    private long idReservation;
    private LocalDateTime dateTime;
    private long idWorker;
    private long idService;
    private long idClient;
}
