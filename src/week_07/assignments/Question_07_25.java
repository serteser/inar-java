package week_07.assignments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double[] eqn = new double[3];
        double[] roots = new double[2];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        double discriminant = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);

        if (discriminant > 0) {
            System.out.printf("The number of real roots: %d\n", solveQuadratic(eqn, roots));
            System.out.printf("The root(s) of equation: %.1f %.1f", roots[0], roots[1]);
        } else if (discriminant == 0) {
            System.out.printf("The root(s) of equation: %f", roots[0]);
        } else {
            System.out.println("The equation has no real root.");
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);
        double r1 = (-eqn[1] + Math.sqrt(discriminant)) / 2 * eqn[0];
        double r2 = (-eqn[1] - Math.sqrt(discriminant)) / 2 * eqn[0];
        roots[0] = r1;
        roots[1] = r2;
        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        }
        return 0;
    }
}
