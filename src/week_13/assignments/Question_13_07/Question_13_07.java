package week_13.assignments.Question_13_07;

public class Question_13_07 {
    public static void main(String[] args) {

        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Triangle(3.6, 4.2, 5.6);
        geometricObjects[1] = new Circle(7.071);
        geometricObjects[2] = new Rectangle(4, 5);
        geometricObjects[3] = new Square(5);
        geometricObjects[4] = new Square(0);

        for (int i = 0; i < geometricObjects.length; i++) {

            System.out.printf("Area of Geometric Object in the index %d is : %f \n", i, geometricObjects[i].getArea());
            if (geometricObjects[i] instanceof Colorable) {
                ((Colorable) geometricObjects[i]).howToColor();
            }
            System.out.println("------------------------------------");
        }
    }

}
