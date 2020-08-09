package com.rentacar;

import com.rentacar.cars.Car;
import com.rentacar.users.Accounts;
import com.rentacar.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public void login(List<Accounts> accounts) {

        Scanner scn = new Scanner(System.in);
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
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")){
                isInputincorrect = false;
            }
            else {
                System.out.print("Please enter a valid input: ");
            }
        }
        while (isInputincorrect);


        if (input.equalsIgnoreCase("1")) {
            System.out.println("");
            System.out.println("Logging in");
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
                                break;
                            }
                        }
                    }

                    if (isLoginUnsuccessful) {
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
                            System.out.println("");
                            System.out.println("Creating a new account");
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

        else {
            System.out.println("");
            System.out.println("Creating a new account");
            createAnAccount(accounts);
        }


    }

    public static List<Accounts> createAnAccount(List<Accounts> accounts) {
        Scanner sc = new Scanner(System.in);

        String username;
        String password;
        String repeatPassword;

        boolean isInputIncorrect = true;

        do {
            System.out.print("Enter a username: ");
            username = sc.nextLine();

            System.out.print("Enter a password: ");
            password = sc.nextLine();

            System.out.print("Repeat password: ");
            repeatPassword = sc.nextLine();

            boolean isUserNameTaken = false;

            for (int i = 0; i < accounts.size(); i++) {
                if (username.equalsIgnoreCase(accounts.get(i).getUsername())) {
                    isUserNameTaken = true;
                    break;
                }
            }

            if (password.equalsIgnoreCase(repeatPassword) && !isUserNameTaken) {
                System.out.println("Username created. Login!");
                System.out.println("");
                isInputIncorrect = false;
            } else if (!password.equalsIgnoreCase(repeatPassword) && !isUserNameTaken){
                System.out.println("You've typed your password wrong!");
            }
            else if (password.equalsIgnoreCase(repeatPassword) && isUserNameTaken){
                System.out.println("Username taken!");
            }
            else {
                System.out.println("Username taken and you've entered 2 different passwords!");
            }



        }
        while (isInputIncorrect);

        Accounts addedUsername = new User(username, password);
        accounts.add(addedUsername);

        App loginApp = new App();
        loginApp.login(accounts);
        return accounts;
    }


    public static void chooseYourOption(List<Car> cars) {
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("1. Show all cars");
        System.out.println("2. Show cars by a filter");
        System.out.println("3. Sort cars");
        System.out.print("Choose you option: ");

        Scanner sc = new Scanner(System.in);
        boolean isOptionWrong = true;

        String input;
        do {
            input = sc.next();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2") || input.equalsIgnoreCase("3")) {
                isOptionWrong = false;
            } else {
                System.out.println("Please enter a correct input! (1 or 2)");
            }
        }
        while (isOptionWrong);

        if (input.equalsIgnoreCase("1")) {
            showAllCars(cars);
        } else if (input.equalsIgnoreCase("2")) {
            showAllFilters(cars);
        } else {
            sortCars(cars);
        }
    }

    public static void showAllCars(List<Car> cars) {
        String transmision;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManual()) {
                transmision = "manual";
            } else {
                transmision = "automatic";
            }
            if (i < 9) {
                System.out.println(" " + (i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel()
                        + " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() + " engine, with an " + transmision
                        + " transmision. The car is " + cars.get(i).getColor().toLowerCase() + " and costs " + cars.get(i).getPrice() + "€.)");
            } else {
                System.out.println((i + 1) + ". " + cars.get(i).getMake() + " " + cars.get(i).getModel() + " (year " + cars.get(i).getYear() + ", " + cars.get(i).getEngine() + " engine, with an " + transmision
                        + " transmision. The car is " + cars.get(i).getColor() + " and costs " + cars.get(i).getPrice() + "€.)");
            }
        }

        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("1. Go back");
        System.out.println("2. Rent a car");

        System.out.print("Your answer: ");

        Scanner scn = new Scanner(System.in);
        String input;
        boolean isInputIncorrect = true;

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }

        }
        while (isInputIncorrect);

        if (input.equalsIgnoreCase("1")) {
            chooseYourOption(cars);
        } else {
            rentACar(cars);
        }
    }

    public static void showAllFilters(List<Car> cars) {
        List<Car> filtredCars = new ArrayList<>();

        System.out.println("");
        System.out.println("Filter by:");
        System.out.println("1. Make");
        System.out.println("2. Price");
        System.out.println("3. Release year");
        System.out.println("4. Fuel type");
        System.out.println("5. Engine");

        System.out.print("Select you option: ");
        Scanner scn = new Scanner(System.in);
        boolean isInputIncorrect = true;

        do {
            String input = scn.nextLine();
            switch (input) {
                case "1":
                    filtredCars = AppFilter.filterByMake(cars);
                    isInputIncorrect = false;
                    break;

                case "2":
                    filtredCars = AppFilter.filterByPrice(cars);
                    isInputIncorrect = false;
                    break;

                case "3":
                    filtredCars = AppFilter.filterByYear(cars);
                    isInputIncorrect = false;
                    break;

                case "4":
                    filtredCars = AppFilter.filterByFuel(cars);
                    isInputIncorrect = false;
                    break;

                case "5":
                    filtredCars = AppFilter.filterByEngine(cars);
                    isInputIncorrect = false;
                    break;

                default:
                    System.out.println("");
                    System.out.print("Please enter a number from 1 to 5: ");
            }
        }
        while (isInputIncorrect);

        isInputIncorrect = true;
        String input;
        System.out.println(""); //space between output lines
        System.out.println("Filter the cars again? ");
        System.out.print("Your answer: ");

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }

        }
        while (isInputIncorrect);

        isInputIncorrect = true;


        if (input.equalsIgnoreCase("yes")) {
            showAllFilters(filtredCars);
        } else {
            System.out.println("What do you want to do?");
            System.out.println("1. Go back");
            System.out.println("2. Rent a car");

            System.out.print("Your answer: ");

            do {
                input = scn.nextLine();
                if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
                    isInputIncorrect = false;
                } else {
                    System.out.print("Please enter a valid input: ");
                }

            }
            while (isInputIncorrect);

            if (input.equalsIgnoreCase("1")) {
                chooseYourOption(cars);
            } else {
                rentACar(cars);
            }
        }

    }


    public static void sortCars(List<Car> cars) {
        System.out.println("");
        System.out.println("Sort by:");
        System.out.println("1. Name");
        System.out.println("2. Price (low to high)");
        System.out.println("3. Price (high to low)");
        System.out.println("4. Engine capacity");
        System.out.println("5. Year of production");

        System.out.print("Select your option: ");
        Scanner scn = new Scanner(System.in);


        boolean isInputIncorrect = true;
        do {
            String input = scn.nextLine();
            switch (input) {
                case "1":
                    AppSort.sortByName(cars);
                    isInputIncorrect = false;
                    break;

                case "2":
                    AppSort.sortByPriceLowToHigh(cars);
                    isInputIncorrect = false;
                    break;

                case "3":
                    AppSort.sortByPriceHighToLow(cars);
                    isInputIncorrect = false;
                    break;

                case "4":
                    AppSort.sortByEngine(cars);
                    isInputIncorrect = false;
                    break;

                case "5":
                    AppSort.sortByYear(cars);
                    isInputIncorrect = false;
                    break;

                default:
                    System.out.println("");
                    System.out.print("Please enter a number from 1 to 5: ");
            }
        }
        while (isInputIncorrect);

        isInputIncorrect = true;
        String input;
        System.out.println(""); //space between output lines
        System.out.println("Sort the cars again? ");
        System.out.print("Your answer: ");

        do {
            input = scn.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                isInputIncorrect = false;
            } else {
                System.out.print("Please enter a valid input: ");
            }

        }
        while (isInputIncorrect);

        isInputIncorrect = true;


        if (input.equalsIgnoreCase("yes")) {
            sortCars(cars);
        } else {
            System.out.println("What do you want to do?");
            System.out.println("1. Go back");
            System.out.println("2. Rent a car");

            System.out.print("Your answer: ");

            do {
                input = scn.nextLine();
                if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2")) {
                    isInputIncorrect = false;
                } else {
                    System.out.print("Please enter a valid input: ");
                }

            }
            while (isInputIncorrect);

            if (input.equalsIgnoreCase("1")) {
                chooseYourOption(cars);
            } else {
                rentACar(cars);
            }
        }
    }


    public static List<Car> rentACar(List<Car> cars) {
        return cars; //todo  just not to break
    }
}