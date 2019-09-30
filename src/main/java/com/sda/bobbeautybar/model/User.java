package com.sda.bobbeautybar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    List<Service> services = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "worker")
    List<Reservation> workerReservation = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "client")
    List<Reservation> clientReservation = new ArrayList<>();
    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "idUser")},
            inverseJoinColumns = {@JoinColumn(name = "idRole")}
    )
    List<Role> roles = new ArrayList<>();

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
