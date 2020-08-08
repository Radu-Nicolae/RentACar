package com.rentacar;

import com.rentacar.cars.Car;
import com.rentacar.cars.bmw.BmwXType;
import com.rentacar.cars.bmw.X1;
import com.rentacar.cars.bmw.X3;
import com.rentacar.cars.bmw.X5;
import com.rentacar.cars.dacia.Duster;
import com.rentacar.cars.dacia.Logan;
import com.rentacar.users.Accounts;
import com.rentacar.users.Admin;
import com.rentacar.users.User;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Car> getCarList(){
        List<Car> cars = new ArrayList<Car>();

        BmwXType bmw1_0 = new X1("BMW", "X1","Diesel","Black","SUV", 2.0, true, 4,100, 2018); cars.add(bmw1_0);
        BmwXType bmw1_1 = new X1("BMW","X1","Diesel", "Black", "SUV", 2.8, true,4,120, 2020); cars.add(bmw1_1);
        BmwXType bmw1_2 = new X1("BMW", "X1","Diesel", "Silver", "SUV", 1.8, true, 4,70, 2010); cars.add(bmw1_2);

        BmwXType bmw2_0 = new X3("BMW", "X3","Gasoline", "Black", "SUV", 1.8, false, 4, 80, 2015); cars.add(bmw2_0);
        BmwXType bmw2_1 = new X3("BMW", "X3","Diesel", "Silver", "SUV", 2.4, false, 4, 140, 2020); cars.add(bmw2_1);
        BmwXType bmw2_2 = new X3("BMW", "X3","Diesel", "White", "SUV", 2.0, true, 4, 100, 2018); cars.add(bmw2_2);

        BmwXType bmw3_0 = new X5("BMW", "X5","Diesel", "Pink", "SUV", 4.0, true, 4, 200, 2020); cars.add(bmw3_0);
        BmwXType bmw3_1 = new X5("BMW", "X5","Gasoline", "Black", "SUV", 2.5, true, 4, 120, 2009); cars.add(bmw3_1);
        BmwXType bmw3_2 = new X5("BMW", "X5","Gasoline", "Silver", "SUV", 1.8, true, 4, 70, 2002); cars.add(bmw3_2);
        BmwXType bmw3_3 = new X5("BMW", "X5","Diesel","Black","SUV",2.0,true,4,110, 2015); cars.add(bmw3_3);


        Car dacia1_0 = new Duster("Dacia", "Duster","Diesel", "Black", "SUV", 1.5, true,4, 40, 2015); cars.add(dacia1_0);
        Car dacia1_1 = new Duster("Dacia", "Duster","Diesel", "Black", "SUV", 1.5, true, 4, 40, 2015); cars.add(dacia1_1);
        Car dacia1_2 = new Duster("Dacia", "Duster","Diesel", "Blue", "SUV", 1.7, false,4,50,2015); cars.add(dacia1_2);

        Car dacia2_0 = new Logan("Dacia", "Logan", "Gasoline", "White", "Normal", 1.2, true, 4, 30, 2007); cars.add(dacia2_0);
        Car dacia2_1 = new Logan("Dacia", "Logan","Gasoline", "Red", "Normal", 1.5, true, 4,40, 2014); cars.add(dacia2_1);
        Car dacia2_2 = new Logan("Dacia", "Logan","Diesel", "Black", "Normal", 1.4, true, 4,50, 2017); cars.add(dacia2_2);
        Car dacia2_3 = new Logan("Dacia", "Logan","Diesel", "Black", "Normal", 1.6, true, 4,50, 2017); cars.add(dacia2_3);

        return cars;
    }


    public static List<String> getCarMakes(){
        List<String> carMakes = new ArrayList<>();

        carMakes.add("BMW");
        carMakes.add("Dacia");


        return carMakes;
    }

    public static List<Accounts> getUserList(){
        //returns user list
        List<Accounts> accounts = new ArrayList<>();

        Accounts admin0 = new Admin("Radu", "222"); accounts.add(admin0);
        Accounts admin1 = new Admin("Bobita", "1234"); accounts.add(admin1);
        Accounts admin2 = new Admin("Adelina", "22415"); accounts.add(admin2);

        Accounts user0 = new User("Radu", "222"); accounts.add(user0);
        Accounts user1 = new User("Marcel", "MRC"); accounts.add(user1);
        Accounts user2 = new User("Vlad", "VLD"); accounts.add(user2);
        Accounts user3 = new User("Adela", "ADL"); accounts.add(user3);
        Accounts user4 = new User("Daniel", "DNL"); accounts.add(user4);
        Accounts user5 = new User("Marian", "MRN"); accounts.add(user5);
        Accounts user6 = new User("Horia", "HRA"); accounts.add(user6);
        Accounts user7 = new User("Daria", "DRA"); accounts.add(user7);
        //no sql :(

        return accounts;
    }


}
