package org.example.app.utils;

import org.example.app.data.DataProvider;
import org.example.app.exception.TemperatureException;

public class AppStarter {

    public void appStarter(){

        DataProvider dataProvider = new DataProvider();
        AppValidator appValidator = new AppValidator();

        try {
            appValidator.validateTemperature(dataProvider.getTemperature());
        } catch (TemperatureException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    public void getOutput(String output){
        System.out.println(output);
    }

}
