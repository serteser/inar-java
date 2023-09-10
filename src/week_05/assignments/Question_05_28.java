package week_05.assignments;

import java.util.Scanner;

public class Question_05_28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter first day of year: ");
        int day = input.nextInt();

        String s00= "Sunday"+ 0;
        String s11= "Monday" +1 ;
        String s22= "Tuesday" +2;
        String s33= "Wednesday" +3;
        String s44= "Thursday" +4;
        String s55= "Friday" +5;
        String s66= "Saturday" +6;
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        String s9 = "";
        String s10 = "";
        String s12 = "";
        s1+=((31 +day)%7);
        s2+=(59 +day)%7;
        s3+=(90 +day)%7;
        s4+=(121 +day)%7;
        s5+=(151 +day)%7;
        s6+=((182 +day)%7);
        s7+=((213 +day)%7);
        s8+=(243 +day)%7;
        s9+=(274 +day)%7;
        s10+=((304 +day)%7);
        s12+=(334 +day)%7;

        System.out.println(s00);
        System.out.println("january 1, "+ year + " is " +day);
        System.out.println("February 1, "+ year + " is " +(31 +day)%7);
        System.out.println("March 1, "+ year + " is " +(59 +day)%7);
        System.out.println("April 1, "+ year + " is " +(90 +day)%7);
        System.out.println("May 1, "+ year + " is " +(121 +day)%7);
        System.out.println("June 1, "+ year + " is " +(151 +day)%7);
        System.out.println("July 1, "+ year + " is " +(182 +day)%7);
        System.out.println("August 1, "+ year + " is " +(213 +day)%7);
        System.out.println("September 1, "+ year + " is " +(243 +day)%7);
        System.out.println("October 1, "+ year + " is " +(274 +day)%7);
        System.out.println("November 1, "+ year + " is " +(304 +day)%7);
        System.out.println("December 1, "+ year + " is " +(334 +day)%7);



    }
}
