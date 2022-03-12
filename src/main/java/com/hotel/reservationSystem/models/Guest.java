package com.hotel.reservationSystem.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String gender;
    private String email;
    private String mobile;
}
