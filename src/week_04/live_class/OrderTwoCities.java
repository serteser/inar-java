package week_04.live_class;

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String city0 = input.nextLine();
        System.out.println("Enter the second city: ");
        String cityA = input.nextLine();

        String city1= city0.trim();
        String cityB = cityA.trim();
        String city2 = city1.toLowerCase();
        String cityC = cityB.toLowerCase();


        if(cityC.compareTo(city2)<0){
            System.out.println("Between two cities " +cityC+ " is the previous one in alphabetic order.");
        }else if (cityC.compareTo(city2)>0)
            System.out.println("Between two cities " +city2+ " is the previous one in alphabetic order.");

        }





    }

