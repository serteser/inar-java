package week_05.assignments;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {

        int count=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (it ends with input of 0): ");
        int data = input.nextInt();

        int max =data;

        while (data!=0){

            data = input.nextInt();

            if(data>max){
                max=data;
                count=1;
            }else if (data == max){
                count++;
            }





        }
        System.out.printf("The largest count %d and the occurrence of the count is %d", max, count );
    }
}
