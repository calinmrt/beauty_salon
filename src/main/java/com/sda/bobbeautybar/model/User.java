package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private long idUser;
    private String email;
    private String password;
    private String phone;
    private String userName;
}
