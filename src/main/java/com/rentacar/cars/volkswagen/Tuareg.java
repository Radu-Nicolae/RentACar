package com.rentacar.cars.volkswagen;

import com.rentacar.cars.Car;

public class Tuareg extends Car {
    public Tuareg(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Volkswagen", "Tuareg", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
