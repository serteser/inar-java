package week_11.assignments.Question_11_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudents(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

}
