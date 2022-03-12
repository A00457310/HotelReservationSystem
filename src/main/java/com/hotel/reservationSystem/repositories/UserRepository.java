package com.hotel.reservationSystem.repositories;

import com.hotel.reservationSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
