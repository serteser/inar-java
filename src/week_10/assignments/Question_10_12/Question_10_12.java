package week_10.assignments.Question_10_12;

public class Question_10_12 {
    public static void main(String[] args) {

//        MyPoint p1 = new MyPoint(2.5,2);
//        MyPoint p2 = new MyPoint(4.2,3);
//        MyPoint p3 = new MyPoint(5,3.5);
//
//        Triangle2D fed = new Triangle2D(p1,p2,p3);
//       // Triangle2D fed1 = new Triangle2D();
//        System.out.println("Area : " + fed.getArea());
//        System.out.println("Perimeter : " + fed.getPerimeter());

        double x1 = 2.5;
        double y1 = 2;
        double x2 = 4.2;
        double y2 = 3;
        double x3 = 5;
        double y3 = 3.5;
        double x4 = 1;
        double y4 = 3.4;
        double a = y2 - y1;
        double b = x1 - x2;
        double c = y4 - y3;
        double d = x3 - x4;
        double e = (a * x1) + (b * y1);
        double f = (c * x3) + (d * y3);
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.println("x => " + x);
        System.out.println("y => " + y);

    }


}
