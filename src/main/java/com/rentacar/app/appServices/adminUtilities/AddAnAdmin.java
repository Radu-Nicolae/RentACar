package com.rentacar.app.appServices.adminUtilities;

import com.rentacar.app.App;
import com.rentacar.cars.Car;
import com.rentacar.users.Account;
import com.rentacar.users.Admin;

import java.util.List;
import java.util.Scanner;

public class AddAnAdmin {

    static Scanner scn = new Scanner(System.in);
    public static List<Account> addAnAdmin(List<Car> cars, List<Account> accounts){
        String username;
        String password;
        String input;
        boolean isInputInvalid = true;
        boolean alreadyExists = false;

        System.out.print("\nYou've selected 'Add an admin'");
        System.out.print("\nEnter username: ");
        username = scn.next();
        System.out.print("Enter password: ");
        password = scn.next();
        System.out.print("Confirm password: ");

        do {
            input = scn.next();
            if (input.equalsIgnoreCase(password)){
                isInputInvalid = false;
            } else {
                System.out.println("Wrong password!");
                addAnAdmin(cars, accounts);
            }
        } while (isInputInvalid);
        Account addedAdmin = new Admin(username, password);

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUsername().equalsIgnoreCase(username) && !alreadyExists){
                System.out.println("Account already exists! Change username or remember your password!\n\n");
                addAnAdmin(cars, accounts);
                alreadyExists = true;
            }
        }

        if (!alreadyExists) {
            System.out.print("\n" + username + " added!");
        }

        accounts.add(addedAdmin);

        App.chooseYourOption(cars, accounts, true);
        return accounts;
    }
}
