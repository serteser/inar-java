package week_05.live_class;

public class NestedLoopsMultiplicationTable {
    public static void main(String[] args) {

        System.out.println("\t\t\t\t\tMultiplication Table");
        System.out.print("\t  ");
        for (int i =1; i<=9; i++){
            System.out.print( i + "     ");
        }
        System.out.println();
        for (int j =1; j<=60; j++){
           System.out.print("-");
        }
        System.out.println();
        for (int i =1; i<=9; i++){
            System.out.print( i + " | ");
            for (int j =1; j<=9; j++){

                System.out.printf("%3d   ", (i*j));
            }
            System.out.println();



        }








    }
}
