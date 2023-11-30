package week_13.assignments.Question_13_16;

public class Question_13_16 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        char[] result = new char[3];

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = add(args[0], args[2]);
                break;
            case '-':
                result = subtract(args[0], args[2]);
                break;
            case '.':
                result = multiply(args[0], args[2]);
                break;
            case '/':
                result = divide(args[0], args[2]);
                break;
        }

        // Display result
        System.out.print(args[0] + ' ' + args[1] + ' ' + args[2] + " = ");
        System.out.println(result);
    }

    public static int[] makeReadyToAlgebraOperation(String args0, String args2) {
        // puring from (" ") quotes
        args0 = args0.substring(1);
        args2 = args2.substring(0, args2.length() - 1);

        // arrays hold the string values of numerator and denominator without "/" sign
        String[] str0 = args0.split("/");
        String[] str2 = args2.split("/");

        // get the int value of numerators and denominators
        int n0 = Integer.parseInt(str0[0]); // 0 index
        int d0 = Integer.parseInt(str0[1]); // 1 index
        int n2 = Integer.parseInt(str2[0]); // 2 index
        int d2 = Integer.parseInt(str2[1]); // 3 index
        return new int[]{n0, d0, n2, d2};
    }

    public static char[] add(String args0, String args2) {

        int[] rational = makeReadyToAlgebraOperation(args0, args2);
        int r0 = (rational[0] * rational[3]) + (rational[2] * rational[1]); // numerator
        int r2 = rational[1] * rational[3]; // denominator

        // string that hold result
        String s = r0 + "/" + r2;

        // string to char array
        return s.toCharArray();
    }

    public static char[] subtract(String args0, String args2) {

        int[] rational = makeReadyToAlgebraOperation(args0, args2);
        int r0 = (rational[0] * rational[3]) - (rational[2] * rational[1]); // numerator
        int r2 = rational[1] * rational[3]; // denominator

        // string that hold result
        String s = r0 + "/" + r2;

        // string to char array
        return s.toCharArray();
    }

    public static char[] multiply(String args0, String args2) {

        int[] rational = makeReadyToAlgebraOperation(args0, args2);
        int r0 = (rational[0] * rational[2]); // numerator
        int r2 = rational[1] * rational[3]; // denominator

        // string that hold result
        String s = r0 + "/" + r2;

        // string to char array
        return s.toCharArray();
    }

    public static char[] divide(String args0, String args2) {

        int[] rational = makeReadyToAlgebraOperation(args0, args2);
        int r0 = (rational[0] * rational[3]); // numerator
        int r2 = rational[1] * rational[2]; // denominator

        // string that hold result
        String s = r0 + "/" + r2;

        // string to char array
        return s.toCharArray();
    }
}
