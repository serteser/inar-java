package week_09.live_class;

public class TestImmutableClass {
    public static void main(String[] args) {

        ImmutableClass student = new ImmutableClass(111223333, "John");
        java.util.Date dateCreated = student.getDateCreated();
        //dateCreated.setTime(200000); // Now dateCreated field is changed!
        System.out.println(student.getDateCreated());
        System.out.println(student.getName());
        dateCreated.setTime(16789345000L);
        System.out.println(student.getDateCreated());
    }

}
