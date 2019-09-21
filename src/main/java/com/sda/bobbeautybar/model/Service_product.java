package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Service_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int consumesUnits;
    @ManyToOne
    @JoinColumn(name="idService", nullable = false)
    private Service service;
    @ManyToOne
    @JoinColumn(name="idProduct", nullable = false)
    private Product product;
}
