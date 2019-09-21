package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String productName;
    private String productCode;
    private int quantity;
    private float measureUnit;
    private double unitPrice;
    @OneToMany(mappedBy="product")
    List<Service_product> serviceProducts=new ArrayList<>();

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", measureUnit=" + measureUnit +
                ", unitPrice=" + unitPrice +
                ", serviceProducts=" + serviceProducts +
                '}';
    }
}
