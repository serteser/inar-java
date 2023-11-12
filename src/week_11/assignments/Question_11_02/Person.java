package week_11.assignments.Question_11_02;

public class Person {
    private String name;
    private String address;
    private long phoneNumber;
    private String emailAddress;

    public Person() {

    }

    public Person(String name, String address, long phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "\t_Person_\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail address: " + emailAddress;
    }
}
