package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args){
        double e=1;
        //double i=10000;
        for (double i=5 ;1<=(i-1) ; i-=2){
            e*= 1.0/(i*(i-1));
        }
        System.out.println("e at i = 10000 is " + (e));
    }
}
