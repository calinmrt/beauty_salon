package com.sda.bobbeautybar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRole;
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    List<User> users = new ArrayList<>();

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", name='" + name + '\'' +
                '}';
    }
}
