package week_11.assignments.Question_11_02;

public class Student extends Person {
    private final static int FRESHMAN = 0;
    private final static int SOPHOMORE = 1;
    private final static int JUNIOR = 2;
    private final static int SENIOR = 3;

    public Student() {

    }

    public Student(String name, String address, long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);

    }


    @Override
    public String toString() {
        return "\t_Student_\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhone number: " + super.getPhoneNumber() +
                "\nEmail address: " + super.getEmailAddress() + "\nclassStatus: " + Student.FRESHMAN;
    }
}
