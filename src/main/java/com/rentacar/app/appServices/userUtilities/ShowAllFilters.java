package com.rentacar.app.appServices.userUtilities;

import com.rentacar.app.App;
import com.rentacar.app.AppFilter;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowAllFilters {

    public static void showAllFilters(List<Car> cars, List<Account> accounts, boolean isAdmin) {
        List<Car> filtredCars = new ArrayList<>();

        System.out.println("\nFilter by:");
        System.out.println("1. Make");
        System.out.println("2. Price");
        System.out.println("3. Release year");
        System.out.println("4. Fuel type");
        System.out.println("5. Engine");

        System.out.print("Select you option: ");
        Scanner scn = new Scanner(System.in);
        boolean isInputIncorrect = true;

        do {
            String input = scn.nextLine();
            switch (input) {
                case "1":
                    filtredCars = AppFilter.filterByMake(cars);
                    isInputIncorrect = false;
                    break;

                case "2":
                    filtredCars = AppFilter.filterByPrice(cars);
                    isInputIncorrect = false;
                    break;

                case "3":
                    filtredCars = AppFilter.filterByYear(cars);
                    isInputIncorrect = false;
                    break;

                case "4":
                    filtredCars = AppFilter.filterByFuel(cars);
                    isInputIncorrect = false;
                    break;

                case "5":
                    filtredCars = AppFilter.filterByEngine(cars);
                    isInputIncorrect = false;
                    break;

                default:
                    System.out.print("\nPlease enter a number from 1 to 5: ");
            }
        }
        while (isInputIncorrect);

        isInputIncorrect = true;
        String input;
        System.out.println("\nFilter the cars again? ");
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
            showAllFilters(filtredCars, accounts, isAdmin);
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
                App.chooseYourOption(cars, accounts,isAdmin);
            } else {
                App.rentACar(cars, isAdmin, accounts);
            }
        }

    }
}
