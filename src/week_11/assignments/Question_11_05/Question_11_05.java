package week_11.assignments.Question_11_05;

import java.util.ArrayList;

public class Question_11_05 {
    public static void main(String[] args) {

        Course polymorphism = new Course("Polymorphism");
        System.out.println("After adding student to the course..");
        polymorphism.addStudents("Nisanur Altuntas");
        polymorphism.addStudents("Gurkan SERTESER");
        polymorphism.addStudents("Sinan Cetin");
        polymorphism.addStudents("Mehmet Toprak");
        polymorphism.addStudents("Sefa Atakul");
        polymorphism.addStudents("Musa Denis");
        polymorphism.addStudents("Berkan Eris");
        ArrayList<String> students = polymorphism.getStudents();
        displayStudents(students);
        System.out.printf("\nNumber of students: %d\n-------------------", polymorphism.getNumberOfStudents());
        System.out.println("\nAfter dropping student from the course..");
        polymorphism.dropStudent("Sinan Cetin");
        polymorphism.dropStudent("Mehmet Toprak");
        polymorphism.dropStudent("Berkan Eris");
        displayStudents(students);
        System.out.printf("\nNumber of students: %d\n", polymorphism.getNumberOfStudents());
    }

    public static void displayStudents(ArrayList<String> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i) + " - ");
        }
    }
}
