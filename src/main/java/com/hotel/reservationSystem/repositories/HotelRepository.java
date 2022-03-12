package com.hotel.reservationSystem.repositories;

import com.hotel.reservationSystem.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
