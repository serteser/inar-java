package week_14.assignments.Question_14_10;

import java.util.Scanner;
import java.util.Stack;

public class Question_14_10 {
    public static void main(String[] args) {

        Stack<String> stack = getStack();
        double result = operateTheAlgebra(stack);
        System.out.println("Output: " + result);
        System.out.println("Explanation: ((2 + 1) * 3) = 9 ");
    }

    public static Stack<String> getStack() {

        Scanner input = new Scanner(System.in);
        System.out.println("Post Fix Expression = ");
        String expression = input.nextLine();
        String[] partedExpression = expression.split(" ");

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < partedExpression.length; i++) {

            stack.push(partedExpression[i]);
        }
        return stack;
    }

    public static double operateTheAlgebra(Stack<String> stack) {

        double result = 0;

        String[] operands = new String[2];
        Stack<String> stackReverse = new Stack<>();

        while (!stack.isEmpty()) {
            stackReverse.push(stack.pop());
        }

        while (!stackReverse.isEmpty()) {

            char operator = ' ';
            int count = 0;
            int i = 0;

            while (!stackReverse.isEmpty()) {

                char ch = stackReverse.peek().charAt(0);

                if (Character.isDigit(ch)) {
                    operands[i] = (stackReverse.pop());
                    i++;
                } else {
                    operator = ch;
                    stackReverse.pop();
                    count++;
                    break;
                }
            }
            if (count != 0) {

                result = getResult(operator, operands);
                stackReverse.push(result + "");
            }
        }
        return result;
    }

    public static double getResult(char ch, String[] operands) {
        double result = 0;
        switch (ch) {
            case '+':
                result = Double.parseDouble(operands[0]) + Double.parseDouble(operands[1]);
                break;

            case '*':
                result = Double.parseDouble(operands[0]) * Double.parseDouble(operands[1]);
                break;

            case '/':
                result = Double.parseDouble(operands[0]) / Double.parseDouble(operands[1]);
                break;

            case '-':
                result = Double.parseDouble(operands[0]) - Double.parseDouble(operands[1]);
                break;
        }
        return result;
    }
}
