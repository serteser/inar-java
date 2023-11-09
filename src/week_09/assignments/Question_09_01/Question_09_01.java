package week_09.assignments.Question_09_01;

public class Question_09_01 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("--Rectangle 1--");
        umlForRectangle(rectangle1);

        System.out.println();

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("--Rectangle 2--");
        umlForRectangle(rectangle2);
    }

    public static void umlForRectangle(Rectangle r) {
        double area = r.getArea();
        double perimeter = r.getPerimeter();
        System.out.printf("Width    : %-5.1f\nHeight   : %-5.1f\nArea     : %-5.1f\nPerimeter: %-5.1f\n", r.width, r.height, area, perimeter);
    }
}
