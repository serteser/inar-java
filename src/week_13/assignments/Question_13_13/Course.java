package week_13.assignments.Question_13_13;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course() {

    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Course course = (Course) super.clone();
            course.students = students.clone();
            return course;
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < getStudents().length; i++) {
            if (students[i] != null) {
                s += students[i] + ", ";
            }
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }
}
