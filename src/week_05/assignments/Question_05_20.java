package week_05.assignments;

public class Question_05_20 {
    public static void main(String[] args) {

        for ( int i=2  ; i<=1000 ; i++){
            for(int divisor =2 ; divisor<=i; divisor++) {
                if (i%divisor==0 && i==divisor){
                    System.out.print(i + " ");
                }

            }

        }
    }
}
