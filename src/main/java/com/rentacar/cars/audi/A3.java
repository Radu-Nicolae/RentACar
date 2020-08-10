package com.rentacar.cars.audi;

import com.rentacar.cars.Car;

public class A3 extends Car {
    public A3(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Audi", "A3", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
