package com.rentacar.app;

import com.rentacar.app.appServices.*;
import com.rentacar.app.appServices.adminUtilities.AddACar;
import com.rentacar.app.appServices.adminUtilities.AddAnAdmin;
import com.rentacar.app.appServices.adminUtilities.RemoveACar;
import com.rentacar.app.appServices.adminUtilities.UpdateAPrice;
import com.rentacar.app.appServices.userUtilities.ShowAllCars;
import com.rentacar.app.appServices.userUtilities.ShowAllFilters;
import com.rentacar.app.appServices.userUtilities.SortCars;
import com.rentacar.cars.Car;
import com.rentacar.dataSource.DataSource;
import com.rentacar.users.Account;

import java.util.List;


public class App {


    public static boolean login(List<Account> accounts) {
        boolean isAdmin = Login.login(accounts);
        return isAdmin;
    }


    public static void chooseYourOption(List<Car> cars, List<Account> accounts, boolean isAdmin) {
        String input;

        if (isAdmin) {
            ChooseYourOption.writeTextAdmin();
            input = ChooseYourOption.getInputAdmin();
            switch (input) {
                case "1":
                    addACar(cars, accounts);
                    break;
                case "2":
                    removeACar(cars, accounts);
                    break;
                case "3":
                    updateAPrice(cars, accounts);
                    break;
                case "4":
                    addAnAdmin(cars, accounts);
                    break;
                case "5":
                    chooseYourOption(cars, accounts, false);
            }
        } else {
            ChooseYourOption.writeText();
            input = ChooseYourOption.getInput();
            if (input.equalsIgnoreCase("1")) {
                showAllCars(cars, accounts, isAdmin);
            } else if (input.equalsIgnoreCase("2")) {
                showAllFilters(cars, accounts, isAdmin);
            } else {
                sortCars(cars, accounts, isAdmin);
            }
        }
    }

    public static List<Car> addACar(List<Car> cars, List<Account> accounts) {
        cars = AddACar.addACar(cars, accounts);
        return cars;
    }

    public static List<Car> removeACar(List<Car> cars, List<Account> accounts) {
        cars = RemoveACar.removeACar(cars, accounts);
        return cars;
    }

    public static List<Car> updateAPrice(List<Car> cars, List<Account> accounts) {
        cars = UpdateAPrice.updateAPrice(cars, accounts);
        return cars;
    }

    public static List<Account> addAnAdmin(List<Car> cars, List<Account> accounts) {
        accounts = AddAnAdmin.addAnAdmin(cars, accounts);
        return accounts;
    }

    public static void showAllCars(List<Car> cars, List<Account> accounts, boolean isAdmin) {
        ShowAllCars.showAllCars(cars, accounts, isAdmin);
    }

    public static void showAllFilters(List<Car> cars, List<Account> accounts, boolean isAdmin) {
        ShowAllFilters.showAllFilters(cars, accounts, isAdmin);
    }


    public static void sortCars(List<Car> cars, List<Account> accounts, boolean isAdmin) {
        SortCars.sortCars(cars, accounts, isAdmin);
    }


    public static void rentACar(List<Car> cars, boolean isAdmin, List<Account> accounts) {
        List<Car> filtredCars;

        filtredCars = AppRental.rentByMake(cars);

        filtredCars = AppRental.rentByModel(filtredCars);

        filtredCars = AppRental.rentByYear(filtredCars);

        AppRental.chooseYourCar(filtredCars, DataSource.getCarList(), accounts, isAdmin);


    }

}