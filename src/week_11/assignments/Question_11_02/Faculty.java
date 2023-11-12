package week_11.assignments.Question_11_02;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {

    }

    public Faculty(String name, String address, long phoneNumber, String emailAddress, int office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "\t_Faculty_\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhone number: " + super.getPhoneNumber() +
                "\nEmail address: " + super.getEmailAddress() + "\noffice: " + super.getOffice() + "\nsalary: " + super.getSalary() + "\nhiredDate: "
                + super.getHiredDate().getDay() + "." + (super.getHiredDate().getMonth()+1) + "." + super.getHiredDate().getYear()+ "\nofficeHours: " + officeHours
                + "\nrank: " + rank;
    }
}
