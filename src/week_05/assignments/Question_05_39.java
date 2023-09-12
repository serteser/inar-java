package week_05.assignments;

public class Question_05_39 {
    public static void main(String[] args) {
        int salary =5000;
        int goalToEarn= 30000;
        double salesAmount = 10000+(((goalToEarn-((5000*8/100.0)+(5000*10/100.0)+salary))*100)/12);
        System.out.printf("Minimum sales to earn $%d: $%9.2f",goalToEarn,salesAmount);
    }
}
