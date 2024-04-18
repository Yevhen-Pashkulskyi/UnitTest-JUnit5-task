package org.example.app.utils;

import org.example.app.exception.TemperatureException;

public class AppValidator {
    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 35;

    public String validateTemperature(int temperature) throws TemperatureException {

        if (temperature >= MIN_TEMPERATURE & temperature <= MAX_TEMPERATURE) {
            return "The temperature is ok";
        } else {
            throw new TemperatureException("Invalid temperature.");
        }
    }
}
