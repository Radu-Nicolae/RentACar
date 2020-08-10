package com.rentacar.dataSource;

import com.rentacar.cars.Car;
import com.rentacar.cars.audi.*;
import com.rentacar.cars.bmw.X1;
import com.rentacar.cars.bmw.X3;
import com.rentacar.cars.bmw.X5;
import com.rentacar.cars.dacia.Duster;
import com.rentacar.cars.dacia.Logan;
import com.rentacar.cars.volkswagen.Golf;
import com.rentacar.cars.volkswagen.Passat;
import com.rentacar.cars.volkswagen.Polo;
import com.rentacar.cars.volkswagen.Tuareg;
import com.rentacar.users.Account;
import com.rentacar.users.Admin;
import com.rentacar.users.User;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();

        Car bmw1_0 = new X1("Diesel", "Black", "SUV", 2.0, true, 4, 15, 2018);
        cars.add(bmw1_0);
        Car bmw1_1 = new X1("Diesel", "Black", "SUV", 2.8, true, 4, 12, 2020);
        cars.add(bmw1_1);
        Car bmw1_2 = new X1("Diesel", "Silver", "SUV", 1.8, true, 4, 11, 2010);
        cars.add(bmw1_2);

        Car bmw2_0 = new X3("Gasoline", "Black", "SUV", 1.8, false, 4, 10, 2015);
        cars.add(bmw2_0);
        Car bmw2_1 = new X3("Diesel", "Silver", "SUV", 2.4, false, 4, 14, 2020);
        cars.add(bmw2_1);
        Car bmw2_2 = new X3("Diesel", "White", "SUV", 2.0, true, 4, 11, 2018);
        cars.add(bmw2_2);

        Car bmw3_0 = new X5("Diesel", "Pink", "SUV", 4.0, true, 4, 35, 2020);
        cars.add(bmw3_0);
        Car bmw3_1 = new X5("Gasoline", "Black", "SUV", 2.5, true, 4, 11, 2009);
        cars.add(bmw3_1);
        Car bmw3_2 = new X5("Gasoline", "Silver", "SUV", 1.8, true, 4, 12, 2002);
        cars.add(bmw3_2);
        Car bmw3_3 = new X5("Diesel", "Black", "SUV", 2.0, true, 4, 12, 2015);
        cars.add(bmw3_3);


        Car dacia1_0 = new Duster("Diesel", "Black", "SUV", 1.5, true, 4, 8, 2015);
        cars.add(dacia1_0);
        Car dacia1_1 = new Duster("Diesel", "Black", "SUV", 1.5, true, 4, 8, 2015);
        cars.add(dacia1_1);
        Car dacia1_2 = new Duster("Diesel", "Blue", "SUV", 1.7, false, 4, 9, 2015);
        cars.add(dacia1_2);

        Car dacia2_0 = new Logan("Gasoline", "White", "Normal", 1.2, true, 4, 7, 2007);
        cars.add(dacia2_0);
        Car dacia2_1 = new Logan("Gasoline", "Red", "Normal", 1.5, true, 4, 7, 2014);
        cars.add(dacia2_1);
        Car dacia2_2 = new Logan("Diesel", "Black", "Normal", 1.4, true, 4, 8, 2017);
        cars.add(dacia2_2);
        Car dacia2_3 = new Logan("Diesel", "Black", "Normal", 1.6, true, 4, 8, 2017);
        cars.add(dacia2_3);


        Car volkswagen1_0 = new Golf("Diesel", "Gray", "Normal", 2.0, true, 4, 10, 2015);
        cars.add(volkswagen1_0);
        Car volkswagen1_1 = new Golf("Diesel", "Dark Blue", "Normal", 1.8, true, 4, 11, 2017);
        cars.add(volkswagen1_1);
        Car volkswagen1_2 = new Golf("Diesel", "Black", "Sport", 2.5, true, 2, 20, 2018);
        cars.add(volkswagen1_2);
        Car volkswagen1_3 = new Golf("Diesel", "White", "Normal", 1.8, true, 4, 9, 2010);
        cars.add(volkswagen1_3);
        Car volkswagen1_4 = new Golf("Diesel", "Red", "Normal", 1.5, true, 4, 7, 2002);
        cars.add(volkswagen1_4);


        Car volkswagen2_0 = new Polo("Diesel", "Blue", "Normal", 1.2, true, 4, 7, 2010);
        cars.add(volkswagen2_0);
        Car volkswagen2_1 = new Polo("Diesel", "Blue", "Normal", 1.5, true, 4, 10, 2020);
        cars.add(volkswagen2_1);
        Car volkswagen2_2 = new Polo("Diesel", "White", "Normal", 1.5, true, 4, 8, 2014);
        cars.add(volkswagen2_2);
        Car volkswagen2_3 = new Polo("Gasoline", "Black", "Sport", 2.4, false, 2, 20, 2019);
        cars.add(volkswagen2_3);
        Car volkswagen2_4 = new Polo("Gasoline", "Black", "Normal", 1.8, true, 4, 7, 2002);
        cars.add(volkswagen2_4);


        Car volkswagen3_0 = new Passat("Diesel", "Black", "Normal", 2.0, true, 4, 10, 2006);
        cars.add(volkswagen3_0);
        Car volkswagen3_1 = new Passat("Diesel", "Black", "Normal", 2.0, true, 4, 10, 2006);
        cars.add(volkswagen3_1);
        Car volkswagen3_2 = new Passat("Diesel", "Black", "Normal", 2.0, true, 4, 14, 2014);
        cars.add(volkswagen3_2);
        Car volkswagen3_3 = new Passat("Diesel", "Black", "Normal", 2.4, false, 4, 17, 2018);
        cars.add(volkswagen3_3);
        Car volkswagen3_4 = new Passat("Diesel", "Gray", "Normal", 2.2, false, 4, 15, 2017);
        cars.add(volkswagen3_4);


        Car volkswagen4_0 = new Tuareg("Electric", "Black", "SUV", 0.0, false, 4, 18, 2019);
        cars.add(volkswagen4_0);
        Car volkswagen4_1 = new Tuareg("Electric", "Black", "SUV", 0.0, false, 4, 20, 2020);
        cars.add(volkswagen4_1);
        Car volkswagen4_2 = new Tuareg("Diesel", "Gray", "SUV", 2.5, true, 4, 15, 2015);
        cars.add(volkswagen4_2);
        Car volkswagen4_3 = new Tuareg("Diesel", "White", "SUV", 2.2, true, 4, 15, 2018);
        cars.add(volkswagen4_3);


        Car audi1_0 = new A3("Gasoline", "Gray", "Normal", 1.5, true, 4, 8, 2010);
        cars.add(audi1_0);
        Car audi1_1 = new A3("Gasoline", "Black", "Normal", 1.6, true, 4, 8, 2008);
        cars.add(audi1_1);
        Car audi1_2 = new A3("Gasoline", "Blue", "Normal", 1.6, true, 4, 7, 2002);
        cars.add(audi1_2);


        Car audi2_0 = new A5("Diesel", "Black", "Normal", 1.6, true, 4, 9, 2014);
        cars.add(audi2_0);
        Car audi2_1 = new A5("Diesel", "Black", "Sport", 2.4, true, 2, 15, 2015);
        cars.add(audi2_1);
        Car audi2_2 = new A5("Diesel", "White", "Sport", 2.8, true, 2, 17, 2018);
        cars.add(audi2_2);
        Car audi2_3 = new A5("Diesel", "Blue", "Normal", 2.0, true, 4, 11, 2012);
        cars.add(audi2_3);


        Car audi3_0 = new A7("Diesel", "Black", "Normal", 2.2, true, 4, 13, 2015);
        cars.add(audi3_0);
        Car audi3_1 = new A7("Diesel", "Black", "Normal", 2.2, true, 4, 13, 2015);
        cars.add(audi3_1);
        Car audi3_2 = new A7("Diesel", "White", "Normal", 2.0, true, 4, 14, 2015);
        cars.add(audi3_2);
        Car audi3_3 = new A7("Gasoline", "Blue", "Normal", 2.4, true, 4, 15, 2016);
        cars.add(audi3_3);


        Car audi4_0 = new A8("Gasoline", "Black", "Normal", 3.0, true, 4, 17, 2015);
        cars.add(audi4_0);
        Car audi4_1 = new A8("Diesel", "Black", "Normal", 2.7, true, 4, 15, 2015);
        cars.add(audi4_1);
        Car audi4_2 = new A8("Diesel", "White", "Normal", 2.5, true, 4, 14, 2013);
        cars.add(audi4_2);
        Car audi4_3 = new A8("Diesel", "Black", "Sport", 4.0, false, 2, 28, 2019);
        cars.add(audi4_3);


        Car audi5_0 = new Q5("Diesel", "Dark Blue", "SUV", 2.5, true, 4, 17, 2015);
        cars.add(audi5_0);
        Car audi5_1 = new Q5("Diesel", "Dark Blue","SUV", 2.7, true, 4, 18, 2014);
        cars.add(audi5_1);
        Car audi5_2 = new Q5("Diesel", "Black", "SUV", 2.5, true, 4, 17, 2016);
        cars.add(audi5_2);
        Car audi5_3 = new Q5("Diesel", "White", "SUV", 3.0, true, 4, 20, 2015);
        cars.add(audi5_3);



        return cars;
    }


    public static List<String> getCarMakes() {
        List<String> carMakes = new ArrayList<>();

        carMakes.add("BMW");
        carMakes.add("Dacia");
        carMakes.add("Audi");
        carMakes.add("Volkswagen");


        return carMakes;
    }

    public static List<Account> getUserList() {
        //returns user list
        List<Account> accounts = new ArrayList<>();

        Account admin0 = new Admin("Radu", "222");
        accounts.add(admin0);
        Account admin1 = new Admin("Bobita", "1234");
        accounts.add(admin1);
        Account admin2 = new Admin("Adelina", "22415");
        accounts.add(admin2);

        Account user0 = new User("Radu", "222");
        accounts.add(user0);
        Account user1 = new User("Marcel", "MRC");
        accounts.add(user1);
        Account user2 = new User("Vlad", "VLD");
        accounts.add(user2);
        Account user3 = new User("Adela", "ADL");
        accounts.add(user3);
        Account user4 = new User("Daniel", "DNL");
        accounts.add(user4);
        Account user5 = new User("Marian", "MRN");
        accounts.add(user5);
        Account user6 = new User("Horia", "HRA");
        accounts.add(user6);
        Account user7 = new User("Daria", "DRA");
        accounts.add(user7);
        //no sql :(

        return accounts;
    }


}
