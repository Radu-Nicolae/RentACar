package com.rentacar.app;

import com.rentacar.cars.Car;
import com.rentacar.dataSource.DataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppRental {

    public static List<Car> rentByMake(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        boolean isInputIncorrect = true;
        String input;

        List<Car> filtredCars = new ArrayList<>();


        System.out.println("\nYou are about to rent a car");

        System.out.print("Choose the make from the following list: ");

        System.out.print(DataSource.getCarMakes().get(0));
        for (int i = 1; i < DataSource.getCarMakes().size(); i++) {
            System.out.print(", " + DataSource.getCarMakes().get(i));
        }

        System.out.println("\n");
        System.out.print("Your answer: ");

        boolean containsTheInput = false;

        do {
            input = scn.nextLine();
            for (int i = 0; i < DataSource.getCarMakes().size(); i++) {
                if (DataSource.getCarMakes().get(i).equalsIgnoreCase(input)) {
                    containsTheInput = true;
                    break;
                }
            }

            if (containsTheInput) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please choose a valid car make: ");
            }
        }
        while (isInputIncorrect);


        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(input)) {
                filtredCars.add(car);
            }
        }

        return filtredCars;
    }


    public static List<Car> rentByModel(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        boolean isInputIncorrect = true;
        String input;

        List<Car> filtredCars = new ArrayList<>();

        System.out.println("\nChoose the model from the following list: ");

        System.out.println("1. " + cars.get(0).getMake() + " " + cars.get(0).getModel() +
                " (year " + cars.get(0).getYear() + ", " + cars.get(0).getEngine() +
                " " + cars.get(0).getFuelType() + ", " + cars.get(0).getPrice() + "€)");

        for (int i = 1; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel() +
                    " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() +
                    " " + cars.get(i).getFuelType() + ", " + cars.get(i).getPrice() + "€)");
        }

        System.out.print("\nYour answer: ");

        boolean containsTheInput = false;


        do {
            input = scn.nextLine();
            for (Car car : cars) {
                if (car.getModel().equalsIgnoreCase(input)) {
                    containsTheInput = true;
                    break;
                }
            }

            if (containsTheInput) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please choose a valid car make: ");
            }
        }
        while (isInputIncorrect);

        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(input)) {
                filtredCars.add(car);
            }
        }


        return filtredCars;
    }


    public static List<Car> rentByYear(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        boolean isInputIncorrect = true;
        int input;

        List<Car> filtredCars = new ArrayList<>();

        System.out.println("\nChoose the year of production from the following list: ");

        System.out.println("1. " + cars.get(0).getMake() + " " + cars.get(0).getModel() +
                " (year " + cars.get(0).getYear() + ", " + cars.get(0).getEngine() +
                " " + cars.get(0).getFuelType() + ", " + cars.get(0).getPrice() + "€)");

        for (int i = 1; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel() +
                    " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() +
                    " " + cars.get(i).getFuelType() + ", " + cars.get(i).getPrice() + "€)");
        }

        System.out.print("\nYour answer: ");

        boolean containsTheInput = false;


        do {
            input = scn.nextInt();
            for (Car car : cars) {
                if (car.getYear() == input) {
                    containsTheInput = true;
                    break;
                }
            }

            if (containsTheInput) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please choose a valid year: ");
            }
        }
        while (isInputIncorrect);

        for (Car car : cars) {
            if (car.getYear() == input) {
                filtredCars.add(car);
            }
        }

        return filtredCars;
    }

    public static void chooseYourCar(List<Car> cars, List<Car> allCars) {
        Scanner scn = new Scanner(System.in);
        int input;
        List<Car> filtredCars = new ArrayList<>();

        System.out.println("\nChoose the index of your car from the following list: ");

        System.out.println("1. " + cars.get(0).getMake() + " " + cars.get(0).getModel() +
                " (year " + cars.get(0).getYear() + ", " + cars.get(0).getEngine() +
                " " + cars.get(0).getFuelType() + ", " + cars.get(0).getPrice() + "€)");

        if (cars.size() > 1) {
            for (int i = 1; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel() +
                        " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() +
                        " " + cars.get(i).getFuelType() + ", " + cars.get(i).getPrice() + "€)");
            }
        }


        boolean isInputIncorrect = true;

        System.out.print("Your answer: ");
        do {
            input = scn.nextInt();
            if (input <= cars.size() && input > 0) {
                isInputIncorrect = false;
            } else {
                System.out.print("\nPlease enter a valid input: ");
            }
        }
        while (isInputIncorrect);

        Car car1 = cars.get(input - 1);
        filtredCars.add(car1);

        System.out.println("\nYou are about to rent " + filtredCars.get(0).getMake() + " " + filtredCars.get(0).getModel() +
                " (year " + filtredCars.get(0).getYear() + ", " + filtredCars.get(0).getEngine() +
                " " + filtredCars.get(0).getFuelType() + ", " + filtredCars.get(0).getPrice() + ") which costs "
                + filtredCars.get(0).getPrice() + "€ per day.");


        System.out.print("\nEnter the number of days you want to rent the car: ");

        isInputIncorrect = true;

        do {
            input = scn.nextInt();
            if (input > 0 && input <= 14) {
                isInputIncorrect = false;
            } else if (input <= 0) {
                System.out.println("Your must rent a car for at least 1 day");
                System.out.print("Enter a new input: ");
            } else {
                System.out.println("You can rent a car for maximum 14 days");
                System.out.print("Enter a new input: ");
            }
        }
        while (isInputIncorrect);

        System.out.println("\nYou are about to rent a " + filtredCars.get(0).getMake() + " " + filtredCars.get(0).getModel() +
                " for " + input + " days. The price is " + (input * filtredCars.get(0).getPrice()) + "€.");

        System.out.print("\nConfirm? ");

        String stringInput;
        isInputIncorrect = true;

        do {
            stringInput = scn.next();
            if (stringInput.equalsIgnoreCase("yes") || stringInput.equalsIgnoreCase("no")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a correct input: ");
            }
        }
        while (isInputIncorrect);

        if (stringInput.equalsIgnoreCase("yes")) {
            goodBye();
        } else {
            App.chooseYourOption(allCars);
        }

    }


    public static void goodBye() {
        System.out.println("Thank you for using our services, you will the receipt on the email! Have a nice day!");
    }
}
