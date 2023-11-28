package week_13.assignments.Question_13_08;

public class Question_13_08 {
    public static void main(String[] args) {

        MyStack firstStack = new MyStack();
        firstStack.push(4);
        firstStack.push(5);
        firstStack.push(6);
        MyStack secondStack = firstStack.clone();
        System.out.println(firstStack.pop());
        System.out.println("1st Stack: " + firstStack);
        System.out.println("2nd Stack: " + secondStack);
        System.out.println("Is the 1st Stack equal to the 2nd Stack? --> " + firstStack.equals(secondStack));

    }
}
