package com.rentacar.cars.audi;

import com.rentacar.cars.Car;

public class A8 extends Car {
    public A8(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Audi", "A8", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
