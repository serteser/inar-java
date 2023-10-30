package week_09.live_class;

public class School {
    private Student[] students;

    private Teacher[] teachers;

    private String schoolName;

    private String director;

    public School(Student[] students, Teacher[] teachers, String schoolName, String director) {
        this.students = students;
        this.teachers = teachers;
        this.schoolName = schoolName;
        this.director = director;
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new Student[10];
        teachers = new Teacher[3];
    }

    public School() {
        students = new Student[10];
        teachers = new Teacher[3];
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void printStudents(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
    public void printTeachers(){
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i].toString());
        }
    }
}
