package com.hotel.reservationSystem.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "hotels")
@Data
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String price;
    private String url;
    private Integer noOfRooms;
    private Float rating;
    private Boolean availability;
}
