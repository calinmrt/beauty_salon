package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Reservation_products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int consumed_Units;
    @ManyToOne
    @JoinColumn(name="idReservation", nullable = false)
    private Reservation reservation;
    @ManyToOne
    @JoinColumn(name="idProduct", nullable = false)
    private Product product;
}
