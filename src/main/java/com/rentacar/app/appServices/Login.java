package com.rentacar.app.appServices;

import com.rentacar.users.Account;

import java.util.List;
import java.util.Scanner;

public class Login {

    public static void login(List<Account> accounts) {

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
                            CreateAccount.createAnAccount(accounts);
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
            CreateAccount.createAnAccount(accounts);
        }


    }
}
