package week_03.assignments;

public class Question_03_24 {


    public static void main(String[] args) {


        int number1 = 1 + (int) (Math.random() * 13);
        int number2 = 1 + (int) (Math.random() * 4);

        System.out.print("The card you picked is ");

        switch (number1){

        case 1: System.out.print("Ace");break;
        case 2: System.out.print("2");break;
        case 3: System.out.print("3");break;
        case 4: System.out.print("4");break;
        case 5: System.out.print("5");break;
        case 6: System.out.print("6");break;
        case 7: System.out.print("7");break;
        case 8: System.out.print("8");break;
        case 9: System.out.print("9");break;
        case 10: System.out.print("10");break;
        case 11: System.out.print("Jack");break;
        case 12: System.out.print("Queen");break;
        case 13: System.out.print("King");
        }

        System.out.print(" of ");

        switch (number2){
            case 1:
                System.out.print("Clubs");break;
            case 2:
                System.out.print("Diamonds");break;
            case 3:
                System.out.print("Hearts");break;
            case 4:
                System.out.print("Spades");
        }



    }

}