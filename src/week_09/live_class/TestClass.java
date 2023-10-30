package week_09.live_class;

public class TestClass {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        Student student1 = new Student("John" , "Smith ");
        Student student2 = new Student("Tod" , "Dot ");
        Student student3 = new Student("Jacob" , "Ace ");



        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Teacher[] teachers = new Teacher[2];

        Teacher teacher = new Teacher("Andersen" , "Mathematics");
        Teacher teacher2 = new Teacher("Jessica" , "English");

        teachers[0] = teacher;
        teachers[1] = teacher2;

        School school = new School(students , teachers , "Stars" , "Clemency");

        school.printStudents();
        school.printTeachers();





    }
}
