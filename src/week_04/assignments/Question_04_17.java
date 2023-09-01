package week_04.assignments;

import java.util.Scanner;

public class Question_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        //input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = input.nextLine();
        month = input.nextLine();
        String Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
        Jan = "Jan";
        Feb = "Feb";
        Mar = "Mar";
        Apr = "Apr";
        May = "May";
        Jun = "Jun";
        Jul = "Jul";
        Aug = "Aug";
        Sep = "Sep";
        Oct = "Oct";
        Nov = "Nov";
        Dec = "Dec";
        int yearVice = 0;
        if (month.equals(Jan)) {
            System.out.println("Jan " + year + " has 31 days.");
        } else if (month.equals(Feb)) {
            yearVice = (int) (year % 4);
            if (yearVice == 0) {
                System.out.println("Feb " + year + " has 29 days.");
            } else {
                System.out.println("Feb " + year + " has 28 days.");
            }
        } else if (month.equals(Mar)) {
            System.out.println("Mar " + year + " has 31 days.");
        } else if (month.equals(Apr)) {
            System.out.println("Apr " + year + " has 30 days.");
        } else if (month.equals(May)) {
            System.out.println("May " + year + " has 31 days.");
        } else if (month.equals(Jun)) {
            System.out.println("Jun " + year + " has 30 days.");
        } else if (month.equals(Jul)) {
            System.out.println("Jul " + year + " has 31 days.");
        } else if (month.equals(Aug)) {
            System.out.println("Aug " + year + " has 31 days.");
        } else if (month.equals(Sep)) {
            System.out.println("Sep " + year + " has 30 days.");
        } else if (month.equals(Oct)) {
            System.out.println("Oct " + year + " has 31 days.");
        } else if (month.equals(Nov)) {
            System.out.println("Nov " + year + " has 30 days.");
        } else if (month.equals(Dec)) {
            System.out.println("Dec " + year + " has 31 days.");
        }
    }
}
