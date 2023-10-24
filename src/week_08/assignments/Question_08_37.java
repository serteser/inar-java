package week_08.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {

        String[][] capitals = capitals();

        shuffleList(capitals);

        guessCapitals(capitals);
    }

    public static String[][] capitals() {
        String[][] capitals = new String[50][2];
        capitals[0] = new String[]{"Alabama", "Montgomery"};
        capitals[1] = new String[]{"Alaska", "Juneau"};
        capitals[2] = new String[]{"Arizona", "Phoenix"};
        capitals[3] = new String[]{"Arkansas", "Little Rock"};
        capitals[4] = new String[]{"California", "Sacramento"};
        capitals[5] = new String[]{"Colorado", "Denver"};
        capitals[6] = new String[]{"Connecticut", "Hartford"};
        capitals[7] = new String[]{"Delaware", "Dover"};
        capitals[8] = new String[]{"Florida", "Tallahassee"};
        capitals[9] = new String[]{"Georgia", "Atlanta"};
        capitals[10] = new String[]{"Hawaii", "Honolulu"};
        capitals[11] = new String[]{"Idaho", "Boise"};
        capitals[12] = new String[]{"Indiana", "Indianapolis"};
        capitals[13] = new String[]{"Iowa", "Des Moines"};
        capitals[14] = new String[]{"Kansas", "Topeka"};
        capitals[15] = new String[]{"Kentucky", "Frankfort"};
        capitals[16] = new String[]{"Louisiana", "Baton Rouge"};
        capitals[17] = new String[]{"Maine", "Augusta"};
        capitals[18] = new String[]{"Maryland", "Annapolis"};
        capitals[19] = new String[]{"Massachusetts", "Boston"};
        capitals[20] = new String[]{"Michigan", "Lansing"};
        capitals[21] = new String[]{"Minnesota", "Saint Paul"};
        capitals[22] = new String[]{"Mississippi", "Jackson"};
        capitals[23] = new String[]{"Missouri", "Jefferson City"};
        capitals[24] = new String[]{"Montana", "Helena"};
        capitals[25] = new String[]{"Nevada", "Carson City"};
        capitals[26] = new String[]{"New Hampshire", "Concord"};
        capitals[27] = new String[]{"New Jersey", "Trenton"};
        capitals[28] = new String[]{"New Mexico", "Santa Fe"};
        capitals[29] = new String[]{"New York", "Albany"};
        capitals[30] = new String[]{"North Carolina", "Raleigh"};
        capitals[31] = new String[]{"North Dakota", "Bismarck"};
        capitals[32] = new String[]{"Ohio", "Columbus"};
        capitals[33] = new String[]{"Oklahoma", "Oklahoma City"};
        capitals[34] = new String[]{"Oregon", "Salem"};
        capitals[35] = new String[]{"Pennsylvania", "Harrisburg"};
        capitals[36] = new String[]{"Rhode Island", "Providence"};
        capitals[37] = new String[]{"South Carolina", "Columbia"};
        capitals[38] = new String[]{"South Dakota", "Pierre"};
        capitals[39] = new String[]{"Tennessee", "Nashville"};
        capitals[40] = new String[]{"Texas", "Austin"};
        capitals[41] = new String[]{"Utah", "Salt Lake City"};
        capitals[42] = new String[]{" Vermont", "Montpelier"};
        capitals[43] = new String[]{"Virginia", "Richmond"};
        capitals[44] = new String[]{" Washington", "Olympia"};
        capitals[45] = new String[]{"West Virginia", "Charleston"};
        capitals[46] = new String[]{"Wisconsin", "Madison"};
        capitals[47] = new String[]{"Wyoming", "Cheyenne"};
        capitals[48] = new String[]{"Nebraska", "Springfield"};
        capitals[49] = new String[]{"Illinois,Harrisburg"};
        return capitals;
    }

    public static void guessCapitals(String[][] s) {

        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < s.length; i++) {
            System.out.printf("What is the capital of %s? ", s[i][0]);
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(s[i][1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.printf("The correct answer should be %s ", s[i][1]);
            }
        }
        System.out.println("The correct count is " + correctCount);
    }

    public static String[][] shuffleList(String[][] s) {
        String[] city;
        for (int i = s.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            city = s[s.length - 1];
            s[s.length - 1] = s[index];
            s[index] = city;
        }
        return s;
    }
}
