package week_05.assignments;

public class Question_05_42 {
    public static void main(String[] args) {
        final int COMMISSION_SOUGHT = 6234;
        int salary =5000;
        int goalToEarn= COMMISSION_SOUGHT+5000;
        double salesAmount = 10000+(((goalToEarn-((5000*8/100.0)+(5000*10/100.0)+salary))*100)/12);
        System.out.printf("Minimum sales to earn $%d : $%5.0f",COMMISSION_SOUGHT, salesAmount);
    }
}
