package week_04.assignments;
import java.util.Scanner;
public class Question_04_10 {
    public static void main (String[] args){
        String set1 =
                "1 3 5 7\n" +
                "9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31" ;

        String set2 =
                "2 3 6 7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31\n";

        String set3 =
                "4 5 6 7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31\n";

        String set4 =
                "8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";

        int day = 0;

        // Create a Scanner
        Scanner input = new Scanner (System.in);

        // Prompt the user to answer questions
        System.out.println("Is your birthday in Set1?\n");
        System.out.println(set1);
        System.out.println("\nEnter N for No and Y for Yes: ");
        String yesOrNo = input.nextLine();
        char answer = yesOrNo.charAt(0);


        if(answer == 'Y')
            day += 1;

        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set2?\n");
        System.out.println(set2);
        System.out.println("\nEnter N for No and Y for Yes: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(answer == 'Y')
            day += 2;

        // Prompt the user to answer the Question
        System.out.println("\nIs your birthday in Set3?\n");
        System.out.println(set3);
        System.out.println("\nEnter N for No and Y for Yes: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(answer == 'Y')
            day +=4;

        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set4?\n");
        System.out.println(set4);
        System.out.println("\nEnter N for No and Y for Yes: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if(answer == 'Y')
            day +=8;

        // Prompt the user to answer questions
        System.out.println("\nIs your birthday in Set5?\n");
        System.out.println(set5);
        System.out.println("\nEnter N for No and Y for Yes: ");
        yesOrNo = input.nextLine();
        answer = yesOrNo.charAt(0);

        if (answer == 'Y')
            day +=16;

        System.out.println("\nYour birthday is " + day + "!");
    }
}
