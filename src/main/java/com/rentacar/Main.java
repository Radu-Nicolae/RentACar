package com.rentacar;

import com.rentacar.cars.Car;
import com.rentacar.users.Accounts;
import com.rentacar.users.Admin;
import com.rentacar.users.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Accounts> accounts = DataSource.getUserList();
        List<Car> cars = DataSource.getCarList();

        App rentACar = new App();
        rentACar.login(accounts);
        rentACar.chooseYourOption(cars);
    }
}
