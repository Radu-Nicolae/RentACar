package com.rentacar.app.appServices.adminUtilities;

import com.rentacar.app.App;
import com.rentacar.app.AppSort;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;

import java.util.List;
import java.util.Scanner;

public class UpdateAPrice {

    static Scanner scn = new Scanner(System.in);

    public static List<Car> updateAPrice(List<Car> cars, List<Account> accounts) {
        int index;
        int newPrice;
        String input;
        boolean isInputInvalid = true;

        System.out.print("\nYou've selected 'Update a price'");
        AppSort.sortByName(cars);

        System.out.print("\nEnter the index of the car: ");
        index = scn.nextInt();

        System.out.print("\nEnter the new price of the car: ");
        newPrice = scn.nextInt();

        cars.get(index - 1).setPrice(newPrice);
        System.out.println("The price of " + cars.get(index - 1).getMake() + " " + cars.get(index - 1).getModel() +
                " was updated to " + newPrice + "€.");

        System.out.println("\nUpdate another price?");
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
            updateAPrice(cars, accounts);
        }

        App.chooseYourOption(cars, accounts, true);
        return cars;
    }
}
