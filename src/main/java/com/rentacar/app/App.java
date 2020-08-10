package com.rentacar.app;

import com.rentacar.app.appServices.*;
import com.rentacar.cars.Car;
import com.rentacar.dataSource.DataSource;
import com.rentacar.users.Account;

import java.util.List;


public class App {


    public void login(List<Account> accounts) {
        Login.login(accounts);
    }


    public static void chooseYourOption(List<Car> cars) {
        ChooseYourOption.writeText();

        String input = ChooseYourOption.getInput();

        if (input.equalsIgnoreCase("1")) {
            showAllCars(cars);
        } else if (input.equalsIgnoreCase("2")) {
            showAllFilters(cars);
        } else {
            sortCars(cars);
        }
    }

    public static void showAllCars(List<Car> cars){
        ShowAllCars.showAllCars(cars);
    }

    public static void showAllFilters(List<Car> cars){
        ShowAllFilters.showAllFilters(cars);
    }


    public static void sortCars(List<Car> cars){
        SortCars.sortCars(cars);
    }


    public static void rentACar(List<Car> cars) {
        List<Car> filtredCars;

        filtredCars = AppRental.rentByMake(cars);

        filtredCars = AppRental.rentByModel(filtredCars);

        filtredCars = AppRental.rentByYear(filtredCars);

        AppRental.chooseYourCar(filtredCars, DataSource.getCarList());


    }

}