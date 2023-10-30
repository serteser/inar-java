package week_09.live_class;

public class Student {
    private int id ;

    private String name;

    private  String surname;

    private String gender;

    private String section;

    private String phoneNumber;

    private String email;

    private String schoolName;

    private int grade ;

    private  static int numberOfStudent;


    public Student(){
        numberOfStudent++;
    }

    public Student(String name, String surname, String gender, String section, String phoneNumber, String email, String schoolName, int grade) {
        this.id = numberOfStudent;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.section = section;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.schoolName = schoolName;
        this.grade = grade;
        numberOfStudent++;
    }

    public Student( String name, String surname) {
        this.id = numberOfStudent;
        this.name = name;
        this.surname = surname;
        numberOfStudent++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static int getNumberOfStudent(){
        return numberOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", section='" + section + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
