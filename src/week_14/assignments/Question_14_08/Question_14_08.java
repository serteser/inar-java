package week_14.assignments.Question_14_08;


public class Question_14_08 {
    public static void main(String[] args) {

        System.out.println("Use the push method to initialize the stack...");
        MyStack myStack = getMyStack();
        System.out.println(myStack);
        System.out.println("\nAfter a pop method...");
        myStack.pop();
        System.out.println(myStack);
        System.out.println("\nLet's use the pop method two more times and peek at the top of the stack...");
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println("\nCheck the stack whether is empty? " + myStack.empty());
        System.out.println("\nOk then let's make it empty, use the pop method two more times and show each element that we pop...");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("\nCheck the stack whether is empty? " + myStack.empty());
    }

    public static MyStack getMyStack() {
        MyStack myStack = new MyStack();
        for (int i = 0; i < 5; i++) {
            myStack.push((int) (25 + Math.random() * 50));
        }
        return myStack;
    }

}
