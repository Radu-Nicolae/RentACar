package com.rentacar.cars.volkswagen;

import com.rentacar.cars.Car;

public class Golf extends Car {
    public Golf(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Volkswagen", "Golf", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
