package com.rentacar.cars.volkswagen;

import com.rentacar.cars.Car;

public class Passat extends Car {
    public Passat(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Volkswagen", "Passat", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
