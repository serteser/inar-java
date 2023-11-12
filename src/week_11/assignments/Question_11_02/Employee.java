package week_11.assignments.Question_11_02;

import week_10.assignments.Question_10_14.MyDate;


public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate hiredDate= new MyDate();

    public Employee() {

    }

    public Employee(String name, String address, long phoneNumber, String emailAddress, int office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;

    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    @Override
    public String toString() {
        return "\t_Employee_\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhone number: " + super.getPhoneNumber() +
                "\nEmail address: " + super.getEmailAddress() + "\noffice: " + office + "\nsalary: " + salary + "\nhiredDate: "
                + hiredDate.getDay() + "." + (hiredDate.getMonth() + 1) + "." + hiredDate.getYear();
    }


}
