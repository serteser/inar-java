package week_08.live_class;

import java.util.Arrays;

public class SortingByRows {
    public static void main(String[] args) {
        char[][] m = new char[3][3];
        Arrays.fill(m[0], '1');
        Arrays.fill(m[1], ' ');
        Arrays.fill(m[2], ' ');
        displayEmptyBoard(m);

        int[] list = {1, 2, 3, 5, 5, 5, 5, 8};

        System.out.println("The list has " + (isInclude(list) ? "" : "not" ) + " three consecutive numbers");
    }

    public static void displayEmptyBoard(char[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("| " + m[i][j] + " ");
            }
            System.out.println("|\n-------------");
        }
    }
    public static boolean isInclude(int[] a){
        int count=1;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1]){
                count++;
                if(count==3){
                    return true;
                }
            }else{
                count=1;
            }
        }
        return false;
    }

}
