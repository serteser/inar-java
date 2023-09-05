package week_05.assignments;

public class Question_05_19 {
    public static void main(String[] args) {
        int stair= 8;
        for (int i=0; i<stair; i++){
            int capture =i;
            for (int j=1; j<=stair-i; j++){
                System.out.print("      ");
            }
            for (int k=0; k<=i ;k++){
                System.out.printf("%6d", (int) (Math.pow(2,k)));
            }
            for (int m =0; (m<=i && i!=0); i--){
                System.out.printf("%6d", (int) (Math.pow(2,i-1)));
            }
            i=capture;
            System.out.println();
        }
    }
}
