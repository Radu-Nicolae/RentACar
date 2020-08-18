package com.rentacar.app.appServices.userUtilities;

import com.rentacar.app.App;
import com.rentacar.app.AppSort;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;

import java.util.List;
import java.util.Scanner;

public class SortCars {

    public static void sortCars(List<Car> cars, List<Account> accounts, boolean isAdmin) {
        System.out.println("\nSort by:");
        System.out.println("1. Name");
        System.out.println("2. Price (low to high)");
        System.out.println("3. Price (high to low)");
        System.out.println("4. Engine capacity");
        System.out.println("5. Year of production");

        System.out.print("Select your option: ");
        Scanner scn = new Scanner(System.in);


        boolean isInputIncorrect = true;
        do {
            String input = scn.nextLine();
            switch (input) {
                case "1":
                    AppSort.sortByName(cars);
                    isInputIncorrect = false;
                    break;

                case "2":
                    AppSort.sortByPriceLowToHigh(cars);
                    isInputIncorrect = false;
                    break;

                case "3":
                    AppSort.sortByPriceHighToLow(cars);
                    isInputIncorrect = false;
                    break;

                case "4":
                    AppSort.sortByEngine(cars);
                    isInputIncorrect = false;
                    break;

                case "5":
                    AppSort.sortByYear(cars);
                    isInputIncorrect = false;
                    break;

                default:
                    System.out.print("\nPlease enter a number from 1 to 5: ");
            }
        }
        while (isInputIncorrect);

        isInputIncorrect = true;
        String input;
        System.out.println("\nSort the cars again? ");
        System.out.print("Your answer: ");

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }

        }
        while (isInputIncorrect);

        isInputIncorrect = true;


        if (input.equalsIgnoreCase("yes")) {
            sortCars(cars, accounts, isAdmin);
        } else {
            System.out.println("What do you want to do?");
            System.out.println("1. Go back");
            System.out.println("2. Rent a car");

            System.out.print("Your answer: ");

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
}
