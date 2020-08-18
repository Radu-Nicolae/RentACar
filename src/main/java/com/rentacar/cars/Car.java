package com.rentacar.cars;

public class Car {

    private String make;
    private String model;
    private String fuelType;
    private String color;
    private String carType;

    private Double engine;
    private Boolean isManual;

    private Integer doors;
    private Integer price;
    private Integer year;

    public Car(String make, String model, String fuelType, String color, String carType, Double engine, Boolean isManual, Integer doors, Integer price, Integer year) {
        this.make = make;
        this.model = model;
        this.fuelType = fuelType;
        this.color = color;
        this.carType = carType;
        this.engine = engine;
        this.isManual = isManual;
        this.doors = doors;
        this.price = price;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public Boolean getManual() {
        return isManual;
    }

    public void setManual(Boolean manual) {
        isManual = manual;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", color='" + color + '\'' +
                ", carType='" + carType + '\'' +
                ", engine=" + engine +
                ", isManual=" + isManual +
                ", doors=" + doors +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
