package week_11.assignments.Question_11_02;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Gurol", "Istanbul", 9999999999L, "gurol@inar.com");
        System.out.println(person);
        System.out.println();

        Student student = new Student("Nafiz", "Ankara", 3333333333L, "nafiz@gmail.com");
        System.out.println(student);
        System.out.println();

        Employee employee = new Employee("Recai", "İstanbul", 6666666666L, "recai@gmail.com", 910, 6000);
        System.out.print(employee);
        System.out.println();
        System.out.println();

        Faculty faculty = new Faculty("Serhat", "Texas, Dallas", 4133333333L, "serhat@gmail.com", 101, 50000,
                                        "'10am to 6pm'","'manager'");
        System.out.print(faculty);
        System.out.println();
        System.out.println();

        Staff staff = new Staff("Elon", "California", 2030222220L, "elon@musk.com", 12, 6005000, "'CEO'");
        System.out.print(staff);


    }
}
