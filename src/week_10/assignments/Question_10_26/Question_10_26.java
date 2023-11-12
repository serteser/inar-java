package week_10.assignments.Question_10_26;

public class Question_10_26 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("The expression has not been provided as three arguments in the command line");
            System.exit(1);
        }
//        String[] n = args[1].split("0");
//        args[1] = n[0];
        args[0] = args[0].trim();
        args[1] = args[1].trim();
        args[2] = args[2].trim();
        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case 'x':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);

    }
}
