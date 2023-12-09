package week_14.assignments.Question_14_18;

public class Question_14_18 {
    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Steve Doe", "123-456-7890");
        contactManager.addContact("Jane Smith", "789-045-6123");
        contactManager.addContact("Kamran Will", "331-215-6667");
        contactManager.addContact("Jessica Foster", "009-231-5735");
        contactManager.addContact("Clara Santa", "359-000-9873");
        contactManager.addContact("Robin Brown", "556-285-6658");
        contactManager.addContact("Christy Churchill", "290-031-7723");
        contactManager.print();
        System.out.println("\nSteve Doe's Phone Number: " + contactManager.searchByName("Steve Doe"));
        System.out.println("Whose Phone Number is this (789-045-6123)? " + contactManager.searchByPhoneNumber("789-045-6123"));
        System.out.println("Clara Santa's Phone Number: " + contactManager.searchByName("Clara Santa"));
        System.out.println("Whose Phone Number is this (331-215-6667)? " + contactManager.searchByPhoneNumber("331-215-6667"));
    }
}
