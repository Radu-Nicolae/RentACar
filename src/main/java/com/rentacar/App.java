package com.rentacar;

import com.rentacar.cars.Car;
import com.rentacar.users.Accounts;
import com.rentacar.users.User;

import java.util.List;
import java.util.Scanner;

public class App {

    public void login(List<Accounts> accounts) {

        Scanner scn = new Scanner(System.in);
        boolean isLoginUnsuccessful = true;
        boolean isCreateUnsuccessful = true;
        String newAccount;

        do {
            for (int j = 0; j < 3; j++) {
                if (isLoginUnsuccessful) {
                    System.out.print("Enter username: ");
                    String usernameInput = scn.nextLine();

                    System.out.print("Enter password: ");
                    String passwordInput = scn.nextLine();


                    for (int i = 0; i < accounts.size(); i++) {
                        String usernameList = accounts.get(i).getUsername();
                        String passwordList = accounts.get(i).getPassword();

                        if (usernameInput.equalsIgnoreCase(usernameList) &&
                                passwordInput.equals(passwordList)) {
                            System.out.println("Login successful!");
                            isLoginUnsuccessful = false;
                            break;  //10:30 pm done
                        }
                    }
                }

                if (isLoginUnsuccessful){
                    System.out.println("Wrong username or password! Please enter again.");
                    System.out.println("");
                }
            }

            if (isLoginUnsuccessful) {
                System.out.print("Create an account? ");

                do {
                    newAccount = scn.nextLine();
                    if (newAccount.equalsIgnoreCase("yes")) {
                        isCreateUnsuccessful = false;
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


    }

    public static List<Accounts> createAnAccount(List<Accounts> accounts){
        Scanner sc = new Scanner(System.in);

        String username;
        String password;
        String repeatPassword;

        boolean isInputIncorrect = true;

        do {
            System.out.print("Enter your username: ");
            username = sc.nextLine();

            System.out.print("Enter your password: ");
            password = sc.nextLine();

            System.out.print("Repeat you password: ");
            repeatPassword = sc.nextLine();

            if (password.equalsIgnoreCase(repeatPassword)){
                System.out.println("Username created. Login!");
                System.out.println("");
                isInputIncorrect = false;
            }
            else {
                System.out.println("You've typed your password wrong!");
            }

            for (int i = 0; i < accounts.size(); i++) {
                if (username.equalsIgnoreCase(accounts.get(i).getUsername())){
                    System.out.println("Username taken!");
                }
            }
        }
        while (isInputIncorrect);

        Accounts addedUsername = new User(username, password);
        accounts.add(addedUsername);
        return accounts;
    }


    public static void chooseYourOption(List<Car> cars){
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("1. Show all cars");
        System.out.println("2. Show cars by a filter");
        System.out.print("Choose you option: ");

        Scanner sc = new Scanner(System.in);
        boolean isOptionWrong = true;

        String input;
        do {
            input = sc.next();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")){
                isOptionWrong = false;
            }
            else {
                System.out.println("Please enter a correct input! (1 or 2)");
            }
        }
        while (isOptionWrong);

        if (input.equalsIgnoreCase("1")){
            showAllCars(cars);
        }
        else{
            showAllFilters(cars);
        }

        //ToDo just not to die
        //ToDo just not to die
    }

    public static void showAllCars(List<Car> cars){
        String transmision;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManual()){
                transmision = "manual";
            }
            else {
                transmision = "automatic";
            }
            if (i < 9){
                System.out.println(" " + (i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel()
                + " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() + " engine, with an " + transmision
                + " transmision. The car is " + cars.get(i).getColor().toLowerCase() + " and costs " + cars.get(i).getPrice() + "€.)");
            }
            else {
                System.out.println((i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel()+ " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() + " engine, with an " + transmision
                        + " transmision. The car is " + cars.get(i).getColor() + " and costs " + cars.get(i).getPrice() + "€.)");
            }
        }
    }

    public static void showAllFilters(List<Car> cars){

    }
}
