package week_10.assignments.Question_10_09;

public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                students[i] = " ";
                numberOfStudents--;
                String temp = students[i];
                for (int j = i + 1; j < students.length; j++) {
                    students[j - 1] = students[j];
                }
                students[students.length - 1] = temp;
                break;
            }

        }

    }

    public void clear() {
        String[] temp = new String[students.length];
        System.arraycopy(temp, 0, students, 0, temp.length);
        students = temp;
        numberOfStudents = 0;
    }

}
