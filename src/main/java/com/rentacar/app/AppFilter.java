package com.rentacar.app;

import com.rentacar.dataSource.DataSource;
import com.rentacar.cars.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppFilter {

    public static List<Car> filterByMake() {
        Scanner scn = new Scanner(System.in);
        List<String> carMakes = DataSource.getCarMakes();
        List<Car> filteredCars = new ArrayList<>();

        System.out.println("\nWhat car do you want? Select from the following list: ");
        System.out.print(carMakes.get(0));
        for (int i = 1; i < carMakes.size(); i++) {
            System.out.print(", " + carMakes.get(i));
        }

        System.out.println(); //new clear line
        System.out.println(); //new clear line

        System.out.print("Your answer: ");
        boolean isAnswerInvalid = true;
        String input;

        do {
            input = scn.nextLine();
            for (String carMake : carMakes) {
                if (input.equalsIgnoreCase(carMake)) {
                    isAnswerInvalid = false;
                    break;
                }
            }
            if (isAnswerInvalid) {
                System.out.print("Please enter a valid answer: ");
            }
        }
        while (isAnswerInvalid);


        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByPrice(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        int inputMin;
        int inputMax;

        int maximumPrice = 0;
        for (Car car : cars) {
            if (car.getPrice() > maximumPrice) {
                maximumPrice = car.getPrice();
            }
        }

        System.out.println("Enter a minimum price (less or equal to " + maximumPrice + ")");
        System.out.print("Your answer: ");
        inputMin = scn.nextInt();

        System.out.println("Enter a maximum price (less or equal to " + maximumPrice + ")");
        System.out.print("Your answer: ");
        inputMax = scn.nextInt();

        for (Car car : cars) {
            if (car.getPrice() >= inputMin && car.getPrice() <= inputMax) {
                filteredCars.add(car);
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByYear(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        int inputMin;
        int inputMax;

        int maximumYear = 0;
        for (Car car : cars) {
            if (car.getYear() > maximumYear) {
                maximumYear = car.getYear();
            }
        }

        System.out.println("Enter a minimum year (more or equal to " + maximumYear + ")");
        System.out.print("Your answer: ");
        inputMin = scn.nextInt();

        System.out.println("Enter a maximum year (less or equal to " + maximumYear + ")");
        System.out.print("Your answer: ");
        inputMax = scn.nextInt();

        for (Car car : cars) {
            if (car.getYear() >= inputMin && car.getYear() <= inputMax) {
                filteredCars.add(car);
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByFuel(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        String input;
        boolean isInputIncorrect = true;

        System.out.print("Enter what type of fuel do you want cars to have (Diesel, Gasoline, Electric): ");

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("Diesel") || input.equalsIgnoreCase("Gasoline")
                    || input.equalsIgnoreCase("Electric")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputIncorrect);

        for (Car car : cars) {
            if (car.getFuelType().equalsIgnoreCase(input)) {
                filteredCars.add(car);
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByEngine(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        double inputMin;
        double inputMax;

        double maximumCapacity = 0;
        for (Car car : cars) {
            if (car.getEngine() > maximumCapacity) {
                maximumCapacity = car.getEngine();
            }
        }

        System.out.println("Enter a minimum capacity (less or equal to " + maximumCapacity + ")");
        System.out.print("Your answer: ");
        inputMin = scn.nextDouble();

        System.out.println("Enter a maximum year (less than " + maximumCapacity + ")");
        System.out.print("Your answer: ");
        inputMax = scn.nextDouble();

        for (Car car : cars) {
            if (car.getEngine() >= inputMin && car.getEngine() <= inputMax) {
                filteredCars.add(car);
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }

    public static void displayList(List<Car> cars) {

        if (cars.size() == 0) {
            System.out.println("No cars were found");
        } else {
            for (Car car : cars) {
                System.out.println(car.getMake() + " " + car.getModel() + " (year " + car.getYear()
                        + ", is a " + car.getCarType() + " " + car.getColor().toLowerCase() + " car, with "
                        + car.getDoors() + " doors, "
                        + "engine " + car.getFuelType() + " " + car.getEngine() + ", The car costs "
                        + car.getPrice() + "€)");

            }
        }

    }

}
