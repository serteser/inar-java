package week_12.assignments.Question_12_01;

public class CalculatorWithException {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("The expression has not been provided as three arguments in the command line");
            System.exit(1);
        }

        int detector = 0;
        int result = 0;
        try {
            Integer.parseInt(args[0]);
            detector++;
            Integer.parseInt(args[2]);

            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
            }
        } catch (NumberFormatException ex) {

            System.out.println(detector == 0 ? "Wrong input: " + args[0] : "Wrong input: " + args[2]);
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
