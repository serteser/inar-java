package week_03.assignments;
import java.util.Scanner;
public class Question_03_05 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter today's day: ");
        int todayDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = input.nextInt();

        if (todayDay==1){
            System.out.print("Today is Monday and the future day is ");
        }else if (todayDay==2){
            System.out.print("Today is Tuesday and the future day is ");
        }else if (todayDay==3){
            System.out.print("Today is Wednesday and the future day is ");
        }else if (todayDay==4){
            System.out.print("Today is Thursday and the future day is ");
        }else if (todayDay==5){
            System.out.print("Today is Friday and the future day is ");
        }else if (todayDay==6){
            System.out.print("Today is Saturday and the future day is ");
        }else if (todayDay==0){
            System.out.print("Today is Sunday and the future day is ");
        }
        futureDay = ((futureDay%7) + todayDay)%7;
        if (futureDay==1){
            System.out.print("Monday");
        }else if (futureDay==2){
            System.out.print("Tuesday");
        }else if (futureDay==3){
            System.out.print("Wednesday");
        }else if (futureDay==4){
            System.out.print("Thursday");
        }else if (futureDay==5){
            System.out.print("Friday");
        }else if (futureDay==6){
            System.out.print("Saturday");
        }else if (futureDay==0){
            System.out.print("Sunday");
        }



    }
}
