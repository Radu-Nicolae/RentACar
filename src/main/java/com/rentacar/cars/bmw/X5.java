package com.rentacar.cars.bmw;

import com.rentacar.cars.Car;

public class X5 extends Car {


    public X5(String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        super("BMW", "X5", fuelType, color, carType, engine, isManual, doors, price, year);
    }
}
