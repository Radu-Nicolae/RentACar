package com.rentacar.app.appServices.adminUtilities;

import com.rentacar.app.App;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;

import java.util.List;
import java.util.Scanner;

public class AddACar {

    static Scanner scn = new Scanner(System.in);

    public static List<Car> addACar(List<Car> cars, List<Account> accounts) {
        boolean isInputInvalid = true;
        String make;
        String model;
        String fuelType;

        String color;
        String carType;

        double engine;
        boolean isManual = false;
        String manual;

        int doors;
        int price;
        int year;

        System.out.println("\nYou've selected 'Add a car'");

        System.out.print("Enter the car make: ");
        make = scn.next();

        System.out.print("\nEnter the car model: ");
        model = scn.next();

        System.out.print("\nEnter fuel type: ");
        fuelType = scn.next();

        System.out.print("\nEnter color: ");
        color = scn.next();

        System.out.print("\nEnter carType: ");
        carType = scn.next();

        System.out.print("\nEnter engine: ");
        engine = scn.nextDouble();

        System.out.print("\nIs car manual: ");
        do {
            manual = scn.next();
            if (manual.equalsIgnoreCase("yes")){
                isManual = true;
                isInputInvalid = false;
            }
            else if (manual.equalsIgnoreCase("no")){
                isInputInvalid = false;
            }
            else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputInvalid);

        System.out.print("\nEnter the number of doors: ");
        doors = scn.nextInt();

        System.out.print("\nEnter the price: ");
        price = scn.nextInt();

        System.out.print("\nEnter production year: ");
        year = scn.nextInt();

        System.out.println("Car added!");

        Car car = new Car(make, model, fuelType, color, carType, engine, isManual, doors, price, year);
        cars.add(car);

        System.out.println("\n");
        App.chooseYourOption(cars, accounts, true);

        return cars;
    }
}
