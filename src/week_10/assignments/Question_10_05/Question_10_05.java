package week_10.assignments.Question_10_05;

import week_10.live_class.StackOfIntegers;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {

        displayResult();

    }

    public static int[] findPrimeFactors() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int[] list = new int[number];
        int index = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                list[index] = i;
                index++;
            }
        }
        return list;
    }

    public static int[] sortDecreasingOrder(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int currentMax = a[i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (currentMax < a[j]) {
                    currentMax = a[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                a[currentMaxIndex] = a[i];
                a[i] = currentMax;
            }
        }
        return a;
    }

    public static int[] eliminatedFromZeros(int[] a) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                index = i;
                break;
            }
        }
        int[] eliminatedFromZeros = new int[index];
        for (int i = 0; i < index; i++) {
            eliminatedFromZeros[i] = a[i];
        }
        return eliminatedFromZeros;
    }

    public static StackOfIntegers convertToObject(int[] a) {
        StackOfIntegers s = new StackOfIntegers();
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }
        return s;
    }

    public static void displayResult() {
        int[] list = findPrimeFactors();
        int[] sortedDecreasingOrder = sortDecreasingOrder(list);
        int[] eliminatedFromZeros = eliminatedFromZeros(sortedDecreasingOrder);
        System.out.print("Decreasing order: ");
        for (int i = 0; i < eliminatedFromZeros.length; i++) {
            System.out.print(eliminatedFromZeros[i] + " ");
        }
        StackOfIntegers stack = convertToObject(eliminatedFromZeros);
        System.out.print("\nWe used pop() method: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
