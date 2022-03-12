package com.hotel.reservationSystem.services.interfaces;

import com.hotel.reservationSystem.dtos.ReserveHotelRoom;
import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.models.Reservations;
import com.hotel.reservationSystem.models.User;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    List<Hotel> getHotels();
    Reservations reserveHotelRoom(ReserveHotelRoom reserveHotelRoom);
    User createUser(User user);
    User getUser(Integer id);
    Hotel getHotel(Integer id);
}
