package com.rentacar;

import com.rentacar.cars.Car;

import java.util.List;

public class AppSort {


    //ToDo Sort By Name
    public static List<Car> sortByName(List<Car> cars){
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

        return displayList(carsByName);
    }



    //ToDo Sort by Price   (L to H)
    public static List<Car> sortByPriceLowToHigh(List<Car> cars){
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

        return displayList(carsByPrice);
    }


    //ToDo Sort by Price  (H to L)
    public static List<Car> sortByPriceHighToLow(List<Car> cars){
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

        return displayList(carsByPrice);
    }



    //ToDo Sort By Engine Capacity
    public static List<Car> sortByEngine(List<Car> cars){
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

        return displayList(carsByEngine);
    }



    //ToDo Sort By Year
    public static List<Car> sortByYear(List<Car> cars) {
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

        return displayList(carsByYear);

    }


    public static List<Car> displayList(List<Car> cars){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).getMake() + " " + cars.get(i).getModel() + " (year " + cars.get(i).getYear()
                    + ", is a " + cars.get(i).getCarType() + " " + cars.get(i).getColor().toLowerCase() + " car, with "
                    + cars.get(i).getDoors() + " doors, "
                    + "engine " + cars.get(i).getFuelType() + " " + cars.get(i).getEngine() + ", The car costs "
                    + cars.get(i).getPrice() + "€)");

        }

        return cars;
    }
}
