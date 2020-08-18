package com.rentacar.app.appServices.userUtilities;

import com.rentacar.app.App;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;

import java.util.List;
import java.util.Scanner;

public class ShowAllCars {

    public static void showAllCars(List<Car> cars, List<Account> accounts, boolean isAdmin) {

        String transmision;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManual()) {
                transmision = "manual";
            } else {
                transmision = "automatic";
            }
            if (i < 9) { //one space padding before the indexes of the cars in order to align all the cars to the left
                System.out.print(" " + (i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel()
                        + " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() + " engine, with an " + transmision
                        + " transmision. The car is " + cars.get(i).getColor().toLowerCase() + " and costs " + cars.get(i).getPrice() + "€.)");
            } else { //no more need the padding
                System.out.println((i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel() + " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() + " engine, with an " + transmision
                        + " transmision. The car is " + cars.get(i).getColor() + " and costs " + cars.get(i).getPrice() + "€.)");
            }
        }

        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Go back");
        System.out.println("2. Rent a car");

        System.out.print("Your answer: ");

        Scanner scn = new Scanner(System.in);
        String input;
        boolean isInputIncorrect = true;

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }

        }
        while (isInputIncorrect);

        if (input.equalsIgnoreCase("1")) {
            App.chooseYourOption(cars, accounts, isAdmin);
        } else {
            App.rentACar(cars, isAdmin, accounts);
        }
    }
}
