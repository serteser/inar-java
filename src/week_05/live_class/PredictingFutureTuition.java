package week_05.live_class;

public class PredictingFutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double tuitionIncrementRatePerYear= 7/100.0;
        int passingYear = 0;

        while(tuition<=20000){
            tuition =tuition+ (tuition*tuitionIncrementRatePerYear);
            passingYear++;
        }

        System.out.printf("\nTuition will be $%.2f in %d years.",tuition, passingYear);
    }
}
