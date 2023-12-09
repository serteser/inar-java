package week_12.assignments.Question_12_27;

import java.io.File;
import java.io.FileNotFoundException;

public class Question_12_27 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\User\\Workspace\\inar-java\\src\\week_12\\assignments\\Question_12_27");

        File[] holder = file.listFiles();

        for (int i = 0; i < holder.length; i++) {

            if (holder[i].getName().matches("Question\\d_\\d.txt")) {

                StringBuilder stringBuilder = new StringBuilder(holder[i].getName());
                stringBuilder.insert(8, '0');
                File newFile = new File(String.valueOf(stringBuilder));
                holder[i].renameTo(newFile);
            }
        }
    }
}
