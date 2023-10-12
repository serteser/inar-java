package week_07.assignments;

import java.util.Scanner;

public class Question_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        int[] firstPath = new int[numberOfBalls];
        int[] secondPath = new int[numberOfBalls];
        int[] thirdPath = new int[numberOfBalls];
        int[] fourthPath = new int[numberOfBalls];
        int[] fifthPath = new int[numberOfBalls];
        int[] sixthPath = new int[numberOfBalls];
        int[] seventhPath = new int[numberOfBalls];
        int[] slots = new int[numberOfSlots];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;

        // Create paths that balls flow through
        for (int i = 0; i < numberOfBalls; i++) {

            int leftOrRight = (int) (1 + Math.random() * 2);
            firstPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count1++;
            }

            leftOrRight = (int) (1 + Math.random() * 2);
            secondPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count2++;
            }

            leftOrRight = (int) (1 + Math.random() * 2);
            thirdPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count3++;
            }

            leftOrRight = (int) (1 + Math.random() * 2);
            fourthPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count4++;
            }

            leftOrRight = (int) (1 + Math.random() * 2);
            fifthPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count5++;
            }

            leftOrRight = (int) (1 + Math.random() * 2);
            sixthPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count6++;
            }

            leftOrRight = (int) (1 + Math.random() * 2);
            seventhPath[i] = leftOrRight;
            System.out.print(leftOrRight == 1 ? "L " : "R ");
            if (leftOrRight == 2) {
                count7++;
            }

            System.out.println();
        }

        // Find the paths that balls trace and hold this data in an array
        for (int i = 0; i < (numberOfBalls); i++) {
            int ball = (int) (1 + Math.random() * 7);

            switch (ball) {
                case 1:
                    slots[count1]++;
                    break;
                case 2:
                    slots[count2]++;
                    break;
                case 3:
                    slots[count3]++;
                    break;
                case 4:
                    slots[count4]++;
                    break;
                case 5:
                    slots[count5]++;
                    break;
                case 6:
                    slots[count6]++;
                    break;
                case 7:
                    slots[count7]++;
                    break;
            }
        }
        System.out.println();

        // Find the max ball number in a slot, which will be helpful to determine the iteration counts
        int max = slots[0];
        for (int i = 1; i < numberOfSlots; i++) {
            if (max < slots[i]) {
                max = slots[i];
            }
        }

        // Display the balls in the slots
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < numberOfSlots; j++) {

                if (slots[j] >= (max - i)) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}