package org.example.app.data;

import org.example.app.utils.AppValidator;

import java.util.Scanner;

public class DataProvider {
    public int getTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        return scanner.nextInt();
    }
}
