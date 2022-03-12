package com.hotel.reservationSystem.dtos;

public class ReserveHotelRoomResponse {
    private String confirmationId;

    public ReserveHotelRoomResponse(String confirmationId) {
        this.confirmationId = confirmationId;
    }

    public String getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(String confirmationId) {
        this.confirmationId = confirmationId;
    }

    @Override
    public String toString() {
        return "ReserveHotelRoomResponse{" +
                "confirmationId='" + confirmationId + '\'' +
                '}';
    }
}
