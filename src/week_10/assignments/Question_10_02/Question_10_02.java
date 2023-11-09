package week_10.assignments.Question_10_02;

public class Question_10_02 {
    public static void main(String[] args) {

        BMI person1 = new BMI("Martin",33,70,2,33);
        System.out.printf("Name: %s\nBMI: %.1f %s",person1.getName(),person1.getBMI(),person1.getStatus());

        BMI person2 = new BMI("Adam Smith",28,100,2,30);
        System.out.printf("\nName: %s\nBMI: %.1f %s",person2.getName(),person2.getBMI(),person2.getStatus());
    }
}
