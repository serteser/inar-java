package week_08.assignments;
import java.util.Scanner;
public class Question_08_04 {
    public static void main(String[] args) {

        final int WORKING_DAYS = 7;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int numberOfEmployee= input.nextInt();

        // Get the input in a two-dimensional array
        int[][] workingHoursOfEmployees = getArray(numberOfEmployee, WORKING_DAYS);

        // Get the total working hours for each employee via a method
        int[] t = totalWorkingHoursForEachEmployee(workingHoursOfEmployees);

        // Copy the getting array to compare the values after sorting
        int[] initial = new int[t.length];
        System.arraycopy(t,0,initial,0,t.length);

        // Sort the working hours for each employee via a method
        sortWorkingHours(t);

        // Display the result
        displayEmployeesAccordingWorkingHours(t, initial);
    }
    public static int[][] getArray(int row, int column){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the working hours of employees: ");
        int[][] matrix = new int[row][column];
        for ( row = 0; row < matrix.length; row++) {
            for ( column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[] totalWorkingHoursForEachEmployee(int[][] matrix){
        int[] totalWorkingHoursForEachEmployee = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int totalWorkingHours=0;
            for (int column = 0; column < matrix[0].length; column++) {
                totalWorkingHours+=matrix[row][column];
            }
            totalWorkingHoursForEachEmployee[row]=totalWorkingHours;
        }

        return totalWorkingHoursForEachEmployee;
    }
    public static int[] sortWorkingHours(int[] totalWorkingHoursForEachEmployee){

        int[] sortWorkingHours = new int[totalWorkingHoursForEachEmployee.length];
        for (int i = 0; i < sortWorkingHours.length-1; i++) {
            int minHours = totalWorkingHoursForEachEmployee[i];
            int minHoursIndex = i;
            for (int j = i+1; j < sortWorkingHours.length; j++) {
                if (minHours<totalWorkingHoursForEachEmployee[j]){
                    minHours=totalWorkingHoursForEachEmployee[j];
                    minHoursIndex=j;
                }
            }
            if(minHoursIndex!=i){
                totalWorkingHoursForEachEmployee[minHoursIndex]=totalWorkingHoursForEachEmployee[i];
                totalWorkingHoursForEachEmployee[i]=minHours;
            }
        }
        return sortWorkingHours;
    }
    public static void displayEmployeesAccordingWorkingHours(int[] t,int[] initial ){
        System.out.println("Employees and their total hours in decreasing order of the total hours: \n");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < initial.length ; j++) {
                if(t[i]==initial[j]){
                    System.out.printf("Employee %d's total work hour is %d\n",j, t[i]);
                    break;
                }
            }
        }

    }
}
