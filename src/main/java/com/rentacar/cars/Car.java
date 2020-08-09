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

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }


    public String getColor() {
        return color;
    }


    public String getCarType() {
        return carType;
    }


    public Double getEngine() {
        return engine;
    }


    public Boolean getManual() {
        return isManual;
    }


    public Integer getDoors() {
        return doors;
    }


    public Integer getPrice() {
        return price;
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
