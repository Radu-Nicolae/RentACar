package com.rentacar.app.appServices.adminUtilities;

import com.rentacar.app.App;
import com.rentacar.app.AppSort;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;

import java.util.List;
import java.util.Scanner;

public class RemoveACar {

    static Scanner scn = new Scanner(System.in);

    public static List<Car> removeACar(List<Car> cars, List<Account> accounts) {
        int index;
        String input;
        boolean isInputInvalid = true;
        System.out.println("\nYou've selected 'Remove a car'");

        AppSort.sortByName(cars);

        System.out.print("\nEnter the index of the car: ");
        index = scn.nextInt();

        cars.remove(index - 1);
        System.out.println("Car successfully removed!");

        System.out.println("\nRemove another car?");
        System.out.print("Your answer: ");
        do {
            input = scn.next();
            if (input.equalsIgnoreCase("yes")) {
                isInputInvalid = false;

            } else if (input.equalsIgnoreCase("no")) {
                isInputInvalid = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputInvalid);

        if (input.equalsIgnoreCase("yes")) {
            removeACar(cars, accounts);
        }

        App.chooseYourOption(cars, accounts, true);
        return cars;
    }
}
