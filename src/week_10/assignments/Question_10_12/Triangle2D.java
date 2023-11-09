package week_10.assignments.Question_10_12;

import week_10.assignments.Question_10_04.MyPoint;

public class Triangle2D {
    private MyPoint p1 = new MyPoint(0, 0);
    private MyPoint p2 = new MyPoint(1, 1);
    private MyPoint p3 = new MyPoint(2, 5);


    public Triangle2D() {
    }

    public Triangle2D(MyPoint first, MyPoint second, MyPoint third) {
        this.p1 = first;
        this.p2 = second;
        this.p3 = third;
    }


    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(p1, p2);
        double side2 = p1.distance(p1, p3);
        double side3 = p1.distance(p2, p3);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        double side1 = p1.distance(p1, p2);
        double side2 = p1.distance(p1, p3);
        double side3 = p1.distance(p2, p3);
        return side1 + side2 + side3;
    }
//    public boolean contains(MyPoint p){
//      double a =
//    }
}
