package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Service {
    @Id
    @GeneratedValue
    private long idService;
    private String serviceName;
    private double servicePrice;
    private int Duration;
    private long idUser;
}
