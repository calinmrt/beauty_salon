package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Role {
    @Id
    @GeneratedValue
    private int idRole;
    private String name;
}
