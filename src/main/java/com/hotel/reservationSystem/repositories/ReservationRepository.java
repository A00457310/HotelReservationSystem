package com.hotel.reservationSystem.repositories;

import com.hotel.reservationSystem.models.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservations, Integer> {
}
