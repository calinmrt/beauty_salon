package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Service_product {
    @Id
    @GeneratedValue
    private long id;
    private int consumesUnits;
    private long idService;
    private long idProduct;
}
