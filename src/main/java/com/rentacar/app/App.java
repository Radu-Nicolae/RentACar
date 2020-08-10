package com.rentacar.app;

import com.rentacar.app.appServices.ChooseYourOption;
import com.rentacar.app.appServices.ShowAllCars;
import com.rentacar.app.appServices.ShowAllFilters;
import com.rentacar.app.appServices.SortCars;
import com.rentacar.cars.Car;
import com.rentacar.dataSource.DataSource;
import com.rentacar.users.Account;
import com.rentacar.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    Scanner scn = new Scanner(System.in);

    public void login(List<Account> accounts) {

        boolean isLoginUnsuccessful = true;
        boolean isCreateUnsuccessful = true;
        boolean isInputincorrect = true;

        String newAccount;
        String input;

        System.out.println("1. Log in");
        System.out.println("2. Create an account");

        System.out.print("Your answer: ");

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
                isInputincorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputincorrect);


        if (input.equalsIgnoreCase("1")) {
            System.out.println("\nLogging in");
            do {
                for (int j = 0; j < 3; j++) {
                    if (isLoginUnsuccessful) {
                        System.out.print("Enter username: ");
                        String usernameInput = scn.nextLine();

                        System.out.print("Enter password: ");
                        String passwordInput = scn.nextLine();


                        for (Account account : accounts) {
                            String usernameList = account.getUsername();
                            String passwordList = account.getPassword();

                            if (usernameInput.equalsIgnoreCase(usernameList) &&
                                    passwordInput.equals(passwordList)) {
                                System.out.println("Login successful!");
                                isLoginUnsuccessful = false;
                                break;
                            }
                        }
                    }

                    if (isLoginUnsuccessful) {
                        System.out.println("Wrong username or password! Please enter again.\n");
                    }
                }

                if (isLoginUnsuccessful) {
                    System.out.print("Create an account? ");

                    do {
                        newAccount = scn.nextLine();
                        if (newAccount.equalsIgnoreCase("yes")) {
                            isCreateUnsuccessful = false;
                            System.out.println("\nCreating a new account");
                            createAnAccount(accounts);
                            break;
                        } else if (newAccount.equalsIgnoreCase("no")) {
                            isCreateUnsuccessful = false;
                        } else {
                            System.out.println("Please enter a valid input!");
                        }
                    }
                    while (isCreateUnsuccessful);
                }

            }
            while (isLoginUnsuccessful);
        } else {
            System.out.println("\nCreating a new account");
            createAnAccount(accounts);
        }


    }

    public static void createAnAccount(List<Account> accounts) {
        Scanner scn = new Scanner(System.in);

        String username;
        String password;
        String repeatPassword;

        boolean isInputIncorrect = true;

        do {
            System.out.print("Enter a username: ");
            username = scn.nextLine();

            System.out.print("Enter a password: ");
            password = scn.nextLine();

            System.out.print("Repeat password: ");
            repeatPassword = scn.nextLine();

            boolean isUserNameTaken = false;

            for (Account account : accounts) {
                if (username.equalsIgnoreCase(account.getUsername())) {
                    isUserNameTaken = true;
                    break;
                }
            }

            if (password.equalsIgnoreCase(repeatPassword) && !isUserNameTaken) {
                System.out.println("Username created. Login!\n");
                isInputIncorrect = false;
            } else if (!password.equalsIgnoreCase(repeatPassword) && !isUserNameTaken) {
                System.out.println("You've typed your password wrong!");
            } else if (password.equalsIgnoreCase(repeatPassword) && isUserNameTaken) {
                System.out.println("Username taken!");
            } else {
                System.out.println("Username taken and you've entered 2 different passwords!");
            }


        }
        while (isInputIncorrect);

        Account addedUsername = new User(username, password);
        accounts.add(addedUsername);

        App loginApp = new App();
        loginApp.login(accounts);
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