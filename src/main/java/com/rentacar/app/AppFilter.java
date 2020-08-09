package com.rentacar.app;

import com.rentacar.dataSource.DataSource;
import com.rentacar.cars.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppFilter {

    public static List<Car> filterByMake(List<Car> cars) {
        Scanner scn = new Scanner(System.in);
        List<String> carMakes = DataSource.getCarMakes();
        List<Car> filteredCars = new ArrayList<>();

        System.out.println(""); //clear line
        System.out.println("What car do you want? Select from the following list: ");
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
            for (int i = 0; i < carMakes.size(); i++) {
                if (input.equalsIgnoreCase(carMakes.get(i))) {
                    isAnswerInvalid = false;
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
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() > maximumPrice) {
                maximumPrice = cars.get(i).getPrice();
            }
        }

        System.out.println("Enter a minimum price (less or equal to " + maximumPrice + ")");
        System.out.print("Your answer: ");
        inputMin = scn.nextInt();

        System.out.println("Enter a maximum price (less or equal to " + maximumPrice + ")");
        System.out.print("Your answer: ");
        inputMax = scn.nextInt();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() >= inputMin && cars.get(i).getPrice() <= inputMax) {
                filteredCars.add(cars.get(i));
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByYear(List<Car> cars){
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        int inputMin;
        int inputMax;

        int maximumYear = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYear() > maximumYear) {
                maximumYear = cars.get(i).getYear();
            }
        }

        System.out.println("Enter a minimum year (more or equal to " + maximumYear + ")");
        System.out.print("Your answer: ");
        inputMin = scn.nextInt();

        System.out.println("Enter a maximum year (less or equal to " + maximumYear + ")");
        System.out.print("Your answer: ");
        inputMax = scn.nextInt();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYear() >= inputMin && cars.get(i).getYear() <= inputMax) {
                filteredCars.add(cars.get(i));
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByFuel(List<Car> cars){
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        String input;
        boolean isInputIncorrect = true;

        System.out.print("Enter what type of fuel do you want cars to have (Diesel, Gasoline, Electric): ");

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("Diesel") || input.equalsIgnoreCase("Gasoline")
                    || input.equalsIgnoreCase("Electric")){
                isInputIncorrect = false;
            }
            else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputIncorrect);

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getFuelType().equalsIgnoreCase(input)){
                filteredCars.add(cars.get(i));
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }


    public static List<Car> filterByEngine(List<Car> cars){
        Scanner scn = new Scanner(System.in);
        List<Car> filteredCars = new ArrayList<>();
        double inputMin;
        double inputMax;

        double maximumCapacity = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngine() > maximumCapacity) {
                maximumCapacity = cars.get(i).getEngine();
            }
        }

        System.out.println("Enter a minimum capacity (less or equal to " + maximumCapacity + ")");
        System.out.print("Your answer: ");
        inputMin = scn.nextDouble();

        System.out.println("Enter a maximum year (less than " + maximumCapacity + ")");
        System.out.print("Your answer: ");
        inputMax = scn.nextDouble();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngine() >= inputMin && cars.get(i).getEngine() <= inputMax) {
                filteredCars.add(cars.get(i));
            }
        }

        displayList(filteredCars);
        return filteredCars;
    }

    public static List<Car> displayList(List<Car> cars){

        if (cars.size() == 0){
            System.out.println("No cars were found");
        }
        else {
            for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i).getMake() + " " + cars.get(i).getModel() + " (year " + cars.get(i).getYear()
                        + ", is a " + cars.get(i).getCarType() + " " + cars.get(i).getColor().toLowerCase() + " car, with "
                        + cars.get(i).getDoors() + " doors, "
                        + "engine " + cars.get(i).getFuelType() + " " + cars.get(i).getEngine() + ", The car costs "
                        + cars.get(i).getPrice() + "€)");

            }
        }

        return cars;
    }

}
