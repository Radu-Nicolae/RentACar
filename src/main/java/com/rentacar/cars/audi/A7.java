package com.rentacar.cars.audi;

import com.rentacar.cars.Car;

public class A7 extends Car {
    public A7(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("Audi", "A7", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
