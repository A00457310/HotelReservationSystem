package com.hotel.reservationSystem.services.implementations;

import com.hotel.reservationSystem.dtos.ReserveHotelRoom;
import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.models.Reservations;
import com.hotel.reservationSystem.models.User;
import com.hotel.reservationSystem.repositories.HotelRepository;
import com.hotel.reservationSystem.repositories.ReservationRepository;
import com.hotel.reservationSystem.repositories.UserRepository;
import com.hotel.reservationSystem.services.interfaces.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    private HotelRepository hotelRepository;
    private ReservationRepository reservationRepository;
    private UserRepository userRepository;

    @Autowired
    public HotelServiceImpl(HotelRepository hotelRepository,
                            ReservationRepository reservationRepository,
                            UserRepository userRepository) {
        this.hotelRepository = hotelRepository;
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        Hotel saveHotel = hotelRepository.save(hotel);
        return saveHotel;
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Reservations reserveHotelRoom(ReserveHotelRoom reserveHotelRoom) {
        User user = this.getUser(reserveHotelRoom.getUserId());
        Hotel hotel = this.getHotel(reserveHotelRoom.getHotelId());
        Reservations reservations = new Reservations();
        reservations.setUser(user);
        reservations.setHotel(hotel);
        reservations.setCheckInDate(reserveHotelRoom.getCheckInDate());
        reservations.setCheckOutDate(reserveHotelRoom.getCheckOutDate());
        reservations.setCheckOutDate(reserveHotelRoom.getCheckOutDate());
        reservations.setNoOfRoomsBooked(reserveHotelRoom.getNoOfRoomsBooked());
        reservations.setGuests(reserveHotelRoom.getGuests());
        String uniqueID = UUID.randomUUID().toString().substring(0, 7).toUpperCase();
        reservations.setConfirmationId("BR_" + uniqueID);
        Reservations reservation = reservationRepository.save(reservations);
        return reservation;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.getById(id);
    }

    @Override
    public Hotel getHotel(Integer id) {
        return hotelRepository.getById(id);
    }
}
