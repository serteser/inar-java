package week_13.assignments.Question_13_13;

public class Question_13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course course1 = new Course("Inar Academy");
        System.out.printf("Course Name: \"%s\"\n\n", course1.getCourseName());
        course1.addStudent("Burak");
        course1.addStudent("Emre");
        course1.addStudent("Furkan");
        course1.addStudent("Jack");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        System.out.println(course1);
        System.out.println("------------------------");
        Course course2 = (Course) course1.clone();
        course2.addStudent("Johny");
        course2.addStudent("Tonny");
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        System.out.println(course2);


    }


}
