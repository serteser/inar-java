package week_10.live_class;

public class StackOfIntegersTest {
    public static void main(String[] args) {

        StackOfIntegers stack = new StackOfIntegers();

         for (int i = 0; i < 10; i++)
             stack.push(i);

         while (!stack.empty()){
             System.out.print(stack.pop() + " ");
         }
    }
}
