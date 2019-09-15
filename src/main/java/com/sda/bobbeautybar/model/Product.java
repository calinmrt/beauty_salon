package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProduct;
    private String productName;
    private String productCode;
    private int measureUnit;
    private double unitPrice;
    @OneToMany(mappedBy="product")
    List<Service_product> serviceProducts=new ArrayList<>();
}