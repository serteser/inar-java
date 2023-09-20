package week_06.live_class;

public class PrimeNumberVoidMethodSelf {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are\n");
        printPrimeNumbersSelf(11);
    }
    public static void printPrimeNumbersSelf(int numberOfPrimes){
        boolean isPrime = false;

        int counterOfDivisor = 0;
        int counterOfPrimes = 0;

        for (int i =2 ; !isPrime ; i++){
            for (int j = 2 ; j<=i ; j++){
                if (i%j==0){
                    counterOfDivisor++;
                }
            }
            if(counterOfDivisor==1){
            counterOfPrimes++;
                System.out.print(i + " ");
                if (counterOfPrimes==numberOfPrimes){
                    isPrime=true;
                }
            }
            counterOfDivisor=0;

        }


    }
}
