package com.hotel.reservationSystem.dtos;

public class MessageResponse {
    private String message;

    private Object data;

    private Boolean success;

    @Override
    public String toString() {
        return "MessageResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                ", success=" + success +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public MessageResponse(String message, Object data, Boolean success) {
        this.message = message;
        this.data = data;
        this.success = success;
    }
}
