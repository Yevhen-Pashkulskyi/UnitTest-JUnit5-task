package org.example.app.utils;

import org.example.app.data.DataProvider;
import org.example.app.exception.TemperatureException;

public class AppStarter {

    public String appStarter(){

        DataProvider provider = new DataProvider();
        AppValidator validator = new AppValidator();

        try {
           return validator.validateTemperature(provider.getTemperature());
        } catch (TemperatureException e) {
            return e.getMessage();
        }

    }

    public void getOutput(String output){
        System.out.println(output);
    }

}
