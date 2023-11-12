package week_11.assignments.Question_11_02;

public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public Staff(String name, String address, long phoneNumber, String emailAddress, int office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "\t_Staff_\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhone number: " + super.getPhoneNumber() +
                "\nEmail address: " + super.getEmailAddress() + "\noffice: " + super.getOffice() + "\nsalary: " + super.getSalary() + "\nhiredDate: "
                + super.getHiredDate().getDay() + "." + (super.getHiredDate().getMonth()+1) + "." + super.getHiredDate().getYear()+ "\ntitle: " + title;
    }
}
