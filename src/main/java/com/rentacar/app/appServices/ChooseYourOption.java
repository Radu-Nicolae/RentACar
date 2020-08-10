package com.rentacar.app.appServices;

import java.util.Scanner;

public class ChooseYourOption {

    public static void writeText(){
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Show all cars");
        System.out.println("2. Show cars by a filter");
        System.out.println("3. Sort cars");
        System.out.print("Choose you option: ");

    }


    public static String getInput(){
        Scanner scn = new Scanner(System.in);
        boolean isOptionWrong = true;

        String input;
        do {
            input = scn.next();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2") || input.equalsIgnoreCase("3")) {
                isOptionWrong = false;
            } else {
                System.out.println("Please enter a correct input! (1 or 2)");
            }
        }
        while (isOptionWrong);

        return input;
    }
}
