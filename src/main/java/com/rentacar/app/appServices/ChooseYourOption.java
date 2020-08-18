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

    public static void writeTextAdmin(){
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Add a car");
        System.out.println("2. Remove a car");
        System.out.println("3. Update a price");
        System.out.println("4. Add another admin");
        System.out.println("5. Continue as user");
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
                System.out.println("Please enter a correct input! (1, 2 or 3)");
            }
        }
        while (isOptionWrong);

        return input;
    }

    public static String getInputAdmin(){
        Scanner scn = new Scanner(System.in);
        boolean isOptionWrong = true;

        String input;
        do {
            input = scn.next();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2") || input.equalsIgnoreCase("3")
                    || input.equalsIgnoreCase("4") || input.equalsIgnoreCase("5")) {
                isOptionWrong = false;
            } else {
                System.out.println("Please enter a correct input! (1, 2, 3, 4 or 5)");
            }
        }
        while (isOptionWrong);

        return input;
    }
}
