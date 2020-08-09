package com.rentacar;

import com.rentacar.app.App;
import com.rentacar.cars.Car;
import com.rentacar.dataSource.DataSource;
import com.rentacar.users.Accounts;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Accounts> accounts = DataSource.getUserList();
        List<Car> cars = DataSource.getCarList();

        App rentACar = new App();
        rentACar.login(accounts);
        App.chooseYourOption(cars);

    }
}
