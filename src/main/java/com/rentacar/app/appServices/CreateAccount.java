package com.rentacar.app.appServices;

import com.rentacar.app.App;
import com.rentacar.users.Account;
import com.rentacar.users.User;

import java.util.List;
import java.util.Scanner;

public class CreateAccount {

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

        App.login(accounts);
    }
}
