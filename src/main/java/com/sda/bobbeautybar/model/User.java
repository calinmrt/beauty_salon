package com.sda.bobbeautybar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String email;
    private String password;
    private String phone;
    private String userName;
    @OneToMany(mappedBy = "user")
    List<Service> services = new ArrayList<>();
    @OneToMany(mappedBy = "worker")
    List<Reservation> workerReservation = new ArrayList<>();
    @OneToMany(mappedBy = "client")
    List<Reservation> clientReservation = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "user_role",
            joinColumns = { @JoinColumn(name = "idUser") },
            inverseJoinColumns = { @JoinColumn(name = "idRole") }
    )
    List<Role> roles=new ArrayList<>();


}
