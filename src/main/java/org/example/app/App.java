package org.example.app;

import org.example.app.utils.AppStarter;

public class App {
    public static void main(String[] args) {
        AppStarter appStarter= new AppStarter();
        try {
            appStarter.appStarter();
            appStarter.getOutput("Temperature is OK.");
        } catch (RuntimeException e) {
            appStarter.getOutput(e.getMessage());
        }
    }
}
