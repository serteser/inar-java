package week_03.assignments;
import java.util.Scanner;
public class Question_03_18 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds) : ");
        int weightOfPackage = input.nextInt();
        double costOfPackage = 0;

        if(0<weightOfPackage && weightOfPackage<=1){
            costOfPackage = 3.5 * weightOfPackage;
            System.out.println("Shipping cost of package is $" + costOfPackage);
        }else if(1<weightOfPackage && weightOfPackage<=3){
            costOfPackage = 5.5 * weightOfPackage;
            System.out.println("Shipping cost of package is $" + costOfPackage);
        }else if(3<weightOfPackage && weightOfPackage<=10){
            costOfPackage = 8.5 * weightOfPackage;
            System.out.println("Shipping cost of package is $" + costOfPackage);
        }else if(10<weightOfPackage && weightOfPackage<=20){
            costOfPackage = 10.5 * weightOfPackage;
            System.out.println("Shipping cost of package is $" + costOfPackage);
        }else{
            System.out.println("The package cannot be shipped.");
        }










    }
}
