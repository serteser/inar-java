package week_06.assignments;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        System.out.print(isValidPassword(password));
    }

    public static String isValidPassword(String password) {
        String result = "Valid Password";
        int digitCounter = 0;
        for (int i = 0; i <= password.length() - 1; i++) {
            char ch = password.charAt(i);
            if (Character.isLetterOrDigit(ch) && password.length() >= 8) {
                if (Character.isDigit(ch)) {
                    digitCounter++;
                    if (i == password.length() - 1 && digitCounter < 2) {
                        result = "Invalid Password";
                        break;
                    }
                } else if (i == password.length() - 1 && digitCounter < 2) {
                    result = "Invalid Password";
                    break;
                }
            } else {
                result = "Invalid Password";
                break;
            }
        }
        return result;
    }
}
