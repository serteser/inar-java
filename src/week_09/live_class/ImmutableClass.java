package week_09.live_class;

public class ImmutableClass {
    private int id;
 private String name;
 private java.util.Date dateCreated;

         public ImmutableClass(int ssn, String newName) {
         id = ssn;
         name = newName;
         dateCreated = new java.util.Date();
         }

         public int getId() {
         return id;
         }

         public String getName() {
         return name;
         }

         public java.util.Date getDateCreated() {
         return dateCreated;
         }
}
