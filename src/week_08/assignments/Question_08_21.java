package week_08.assignments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {

        // Get a matrix from user
        double[][] cities = getAMatrix();

        // Find the central city
        double[] centralCity = findCentralCity(cities);

        // Calculate the total distance to all other cities
        double totalDistance = totalDistanceFromACertainCity(centralCity, cities);

        // Display the result
        System.out.printf("The central city is at (%.1f, %.1f)\nThe total distance to all other cities is %.2f"
                , centralCity[0], centralCity[1], totalDistance);
    }

    public static double[][] getAMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numberOfCities = input.nextInt();
        System.out.println("Enter the coordinates of the cities: ");
        double[][] m = new double[numberOfCities][2];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                m[row][column] = input.nextDouble();
            }
        }
        return m;
    }

    public static double[] findCentralCity(double[][] m) {
        double centralCity = totalDistanceFromACertainCity(m[0], m);
        double[] coordinatesOfCentralCity;
        coordinatesOfCentralCity = m[0];
        for (int row = 1; row < m.length; row++) {
            if (centralCity > totalDistanceFromACertainCity(m[row], m)) {
                centralCity = totalDistanceFromACertainCity(m[row], m);
                coordinatesOfCentralCity = m[row];
            }
        }
        return coordinatesOfCentralCity;
    }

    public static double totalDistanceFromACertainCity(double[] cc, double[][] m) {

        double totalDistance = 0;
        for (int i = 0; i < m.length; i++) {
            totalDistance += Math.sqrt((m[i][0] - cc[0]) * (m[i][0] - cc[0]) + (m[i][1] - cc[1]) * (m[i][1] - cc[1]));
        }
        return totalDistance;
    }
}
