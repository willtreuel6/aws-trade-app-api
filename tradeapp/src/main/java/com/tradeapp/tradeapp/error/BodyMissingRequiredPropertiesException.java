package com.tradeapp.tradeapp.error;

public class BodyMissingRequiredPropertiesException extends RuntimeException {
    public BodyMissingRequiredPropertiesException(String msg){
        super(msg);
    }
}

