package com.hotel.reservationSystem.dtos;

import com.hotel.reservationSystem.models.Guest;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ReserveHotelRoom {
    private Integer userId;
    private Integer hotelId;
    private Integer noOfRoomsBooked;
    private Date checkInDate;
    private Date checkOutDate;
    private List<Guest> guests = new ArrayList<>();

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(Integer noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
