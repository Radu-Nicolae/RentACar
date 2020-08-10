package com.rentacar.cars.audi;

import com.rentacar.cars.Car;

public class A5 extends Car {
    public A5(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Audi", "A5", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
