package week_10.assignments.Question_10_09;

public class Question_10_09 {
    public static void main(String[] args) {

        Course course = new Course("SDET");
        course.addStudent("Ozgur Kartal");
        course.addStudent("Bilal Topal");
        course.addStudent("Ada Kaya");
        course.addStudent("Besim Karabıyık");
        course.addStudent("Emir Uyanık");

        course.dropStudent("Bilal Topal");

        course.clear();
        System.out.println(course.getNumberOfStudents());

        String[] students = course.getStudents();

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
                System.out.printf("%d %s",(i+1),students[i] + "\n");
        }


    }
}
