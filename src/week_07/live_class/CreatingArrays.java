package week_07.live_class;

public class CreatingArrays {
    public static void main(String[] args) {
        int[] myList; // declaring an array;
        myList = new int[5]; // creating an array ;
        myList[0] = 0; // initializing it;
        myList[1] = 1; // initializing it;
        myList[2] = 12; // initializing it;
        myList[3] = 123; // initializing it;
        myList[4] = 1234; // initializing it;
        //System.out.println(myList[myList.length-1]);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(myList[i]);
            sum += myList[i] + myList[myList.length - 1] + 1;
            System.out.println(sum);
        }
        boolean[] cycle = {true, false, true, true, false};
        int[] bike = {12, 45, 67, 89,};
        System.out.println(cycle[4] ? bike[2] : bike[3]);
    }


}
