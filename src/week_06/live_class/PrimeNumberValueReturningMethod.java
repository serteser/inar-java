package week_06.live_class;

import static week_06.assignments.Question_06_10.isPrime;

public class PrimeNumberValueReturningMethod {
    public static void main(String[] args) {
        System.out.println("\n\t  The first 50 prime numbers are;\n");
        boolean isCount50 = false;
        int i =1;
        int count=0;
        while (!isCount50){
            if(isPrime(i)){
                count++;
                if(count%10==0){
                    System.out.printf("%4d\n", i);
                }else{
                    System.out.printf("%4d", i);
                }
            }else if(count==50){
                isCount50=true;
            }
            i++;
        }

    }
}
