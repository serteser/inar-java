package week_10.assignments.Question_10_15;

import week_10.assignments.Question_10_13.MyRectangle2D;

import java.util.Scanner;

public class Question_10_15 {
    public static void main(String[] args) {

        double[][] points = getMatrix();
        MyRectangle2D rectangle = new MyRectangle2D();
        MyRectangle2D boundingRectangle = rectangle.getRectangle(points);

        System.out.printf("The bounding rectangle's center (%.1f, %.2f), width %.1f, height %.1f", boundingRectangle.getX(), boundingRectangle.getY()
                        ,boundingRectangle.getWidth(), boundingRectangle.getHeight());
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] m = new double[5][2];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextDouble();
            }
        }
        return m;
    }
}
