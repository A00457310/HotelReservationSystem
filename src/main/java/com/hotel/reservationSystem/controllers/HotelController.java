package com.hotel.reservationSystem.controllers;

import com.hotel.reservationSystem.dtos.MessageResponse;
import com.hotel.reservationSystem.dtos.ReserveHotelRoom;
import com.hotel.reservationSystem.dtos.ReserveHotelRoomResponse;
import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.models.Reservations;
import com.hotel.reservationSystem.models.User;
import com.hotel.reservationSystem.services.interfaces.HotelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelService hotelService;
    final static Logger logger = Logger.getLogger(HotelController.class);

    @GetMapping("/")
    public ResponseEntity<MessageResponse> getHotels() {
        System.out.println("asasasaaaaaa%%%%%%%%%");
        List<Hotel> hotels = hotelService.getHotels();
        return new ResponseEntity<>(new MessageResponse("Hotel List", hotels, true), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<MessageResponse> createHotel(@RequestBody Hotel hotel) {
        Hotel reservedHotel = hotelService.createHotel(hotel);
        return new ResponseEntity<>(new MessageResponse("Hotel created",
                reservedHotel, true),
                HttpStatus.OK);
    }

    @PostMapping("/reserve")
    public ResponseEntity<MessageResponse> reserveHotelRoom(@RequestBody ReserveHotelRoom reserveHotelRoom) {
        Reservations reservedHotel = hotelService.reserveHotelRoom(reserveHotelRoom);
        return new ResponseEntity<>(new MessageResponse("Reservation Confirmation",
                new ReserveHotelRoomResponse(reservedHotel.getConfirmationId()), true),
                HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<MessageResponse> createUser(@RequestBody User user) {
        User userCreated = hotelService.createUser(user);
        return new ResponseEntity<>(new MessageResponse("User created", userCreated, true), HttpStatus.OK);
    }
}
