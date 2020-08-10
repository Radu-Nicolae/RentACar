package com.rentacar.cars.dacia;

import com.rentacar.cars.Car;

public class Logan extends Car {


    public Logan(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Dacia", "Duster", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
