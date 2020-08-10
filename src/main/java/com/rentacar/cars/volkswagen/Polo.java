package com.rentacar.cars.volkswagen;

import com.rentacar.cars.Car;

public class Polo extends Car {
    public Polo(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Volkswagen", "Polo", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
