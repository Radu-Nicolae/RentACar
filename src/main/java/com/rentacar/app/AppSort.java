package com.rentacar.app;

import com.rentacar.cars.Car;

import java.util.List;

public class AppSort {


    public static void sortByName(List<Car> cars) {
        List<Car> carsByName;
        carsByName = cars;

        char letterFirst;
        char letterSecond;

        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                letterFirst = carsByName.get(j).getMake().charAt(0);
                letterSecond = carsByName.get(j + 1).getMake().charAt(0);
                if (letterFirst > letterSecond) {
                    Car auxilliar = carsByName.get(j);
                    carsByName.set(j, carsByName.get(j + 1));
                    carsByName.set(j + 1, auxilliar);
                }
            }
        }

        displayList(carsByName);
    }


    public static void sortByPriceLowToHigh(List<Car> cars) {
        List<Car> carsByPrice;
        carsByPrice = cars;


        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                if (carsByPrice.get(j).getPrice() > carsByPrice.get(j + 1).getPrice()) {
                    Car auxilliar = carsByPrice.get(j);
                    carsByPrice.set(j, carsByPrice.get(j + 1));
                    carsByPrice.set(j + 1, auxilliar);
                }
            }


        }

        displayList(carsByPrice);
    }


    public static void sortByPriceHighToLow(List<Car> cars) {
        List<Car> carsByPrice;
        carsByPrice = cars;


        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                if (carsByPrice.get(j).getPrice() < carsByPrice.get(j + 1).getPrice()) {
                    Car auxilliar = carsByPrice.get(j);
                    carsByPrice.set(j, carsByPrice.get(j + 1));
                    carsByPrice.set(j + 1, auxilliar);
                }
            }


        }

        displayList(carsByPrice);
    }


    public static void sortByEngine(List<Car> cars) {
        List<Car> carsByEngine;
        carsByEngine = cars;


        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                if (carsByEngine.get(j).getEngine() > carsByEngine.get(j + 1).getEngine()) {
                    Car auxilliar = carsByEngine.get(j);
                    carsByEngine.set(j, carsByEngine.get(j + 1));
                    carsByEngine.set(j + 1, auxilliar);
                }
            }


        }

        displayList(carsByEngine);
    }


    public static void sortByYear(List<Car> cars) {
        List<Car> carsByYear;
        carsByYear = cars;


        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                if (carsByYear.get(j).getYear() < carsByYear.get(j + 1).getYear()) {
                    Car auxilliar = carsByYear.get(j);
                    carsByYear.set(j, carsByYear.get(j + 1));
                    carsByYear.set(j + 1, auxilliar);
                }
            }
        }

        displayList(carsByYear);

    }

    public static void displayList(List<Car> cars) {
        int i = 1;
        for (Car car : cars) {
            System.out.println(i + ". " + car.getMake() + " " + car.getModel() + " (year " + car.getYear()
                    + ", is a " + car.getCarType() + " " + car.getColor().toLowerCase() + " car, with "
                    + car.getDoors() + " doors, "
                    + "engine " + car.getFuelType() + " " + car.getEngine() + ", The car costs "
                    + car.getPrice() + "€)");
            i++;
        }

    }
}
