package week_14.assignments.Question_14_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContactManager {

    private Map<String, String> contacts;

    public ContactManager(){

        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {

        contacts.put(name, phoneNumber);
    }

    public String searchByName(String name) {

        Set<Map.Entry<String, String>> entrySet = contacts.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {

            if (name.equals(entry.getKey())) {

                return entry.getValue();
            }
        }
        return null;
    }


    public String searchByPhoneNumber(String phoneNumber) {

        Set<Map.Entry<String, String>> entrySet = contacts.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {

            if (phoneNumber.equals(entry.getValue())) {

                return entry.getKey();
            }
        }
        return null;
    }
    public void  print(){

        Set<Map.Entry<String,String>> entrySet = contacts.entrySet();
        System.out.printf("%s %30s\n" , "Names", "PhoneNumbers");

        for (Map.Entry<String,String> entry : entrySet) {

            System.out.printf("%-22s %13s\n",entry.getKey(), entry.getValue());
        }
    }
}
