package week_05.live_class;

public class DisplayPyramid {

    public static void main(String[] args) {
        int stairs = 5;
        for (int i = 1 ; i<=stairs; i++){

            for (int j =stairs-1 ; j>i-1; j--){

                System.out.print("    ");
            }
            //System.out.println();
            for (int k = 0 ; 0<i-k ; k++){

                System.out.printf("%2d  ",i-k);
            }
            //System.out.println();
            for (int m = 2 ; m<=i ; m++){

                System.out.printf("%2d  ",m);
            }
            System.out.println();
        }
    }
}
