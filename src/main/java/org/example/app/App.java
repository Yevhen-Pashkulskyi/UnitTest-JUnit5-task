package org.example.app;

import org.example.app.utils.AppStarter;

public class App {
    public static void main(String[] args) {
        AppStarter appStart= new AppStarter();
        try {
            appStart.appStarter();
            appStart.getOutput("Temperature is OK.");
        } catch (RuntimeException e) {
            appStart.getOutput(e.getMessage());
        }
    }
}
