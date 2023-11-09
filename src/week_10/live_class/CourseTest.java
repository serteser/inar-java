package week_10.live_class;

public class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Daniel Day lewis");
        course1.addStudent("Sandra Bullock");
        course1.addStudent("George Clooney");


        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        course1.dropStudent("Kim Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println(isPrime(0));
//        System.out.println();
//        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
//
//        System.out.println();
//
//        System.out.println("Course number 1 is " + course1.getCourseName());

    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {//If true,number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
}
