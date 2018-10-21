package com.epam.lab.service.model.exception;

public class SeviceFault {
    private String message;

    public SeviceFault(String message){
        this.message = message;
    }
    public SeviceFault(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
