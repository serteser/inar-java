package week_05.assignments;

public class Question_05_23 {
    public static void main(String[] args) {
        double n =50000;
        double i =1 ;
        double sumLeftToRight=0;
        double sumRightToLeft=0;
        for ( i =1; i<=n; i++){
            sumLeftToRight=sumLeftToRight+(1.0/i);
        }
        System.out.println("Summation of series left to right: " + (sumLeftToRight));
        n =50000;
        i =1 ;
        for ( n =50000; n>=i; n--){
            sumRightToLeft=(1.0/n)+sumRightToLeft;
        }
        System.out.println("Summation of series right to left: " + (sumRightToLeft));
        System.out.println("Summation of series right to left - Summation of series left to right: " +(sumRightToLeft-sumLeftToRight));
    }
}
