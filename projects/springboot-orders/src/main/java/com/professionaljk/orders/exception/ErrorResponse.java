package com.professionaljk.orders.exception;

public class ErrorResponse {

    public String timestamp;
    public int status;
    public String error;
    public String message;
    public String path;

    public ErrorResponse(String timestamp, int status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }
}
