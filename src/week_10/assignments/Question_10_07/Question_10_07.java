package week_10.assignments.Question_10_07;

import week_09.assignments.Question_09_07.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {

        Account[] accounts = createAndInitializeTenAccounts();
        simulateAtm(accounts);
    }

    public static Account[] createAndInitializeTenAccounts() {
        Account[] account = new Account[10];
        for (int i = 0; i < 10; i++) {
            account[i] = new Account(i, 100);
        }
        return account;
    }

    public static boolean isCorrectId(int number) {
        return (10 > number && number >= 0);
    }

    public static void displayMainMenu() {
        System.out.println("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
    }

    public static void simulateAtm(Account[] a) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            if (!isCorrectId(id)) {
                while (!isCorrectId(id)) {
                    System.out.print("Please enter a correct id: ");
                    id = input.nextInt();
                }
            }
            int choice;
            do {
                displayMainMenu();
                System.out.print("Enter a choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.printf("The balance is %.1f\n", a[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        a[id].withdraw(input.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        a[id].deposit(input.nextDouble());
                        break;
                    default:
                }
            } while (choice != 4);

        } while (i == 0);


    }

}

