package com.hotel.reservationSystem;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelReservationApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(HotelReservationApplication.class, args);
	}

}
