package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue
    private long idProduct;
    private String productName;
    private String productCode;
    private int measureUnit;
    private double unitPrice;
}
