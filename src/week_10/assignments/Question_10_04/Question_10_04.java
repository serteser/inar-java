package week_10.assignments.Question_10_04;

public class Question_10_04 {
    public static void main(String[] args) {

        MyPoint firstPoint = new MyPoint();
        MyPoint secondPoint = new MyPoint(10,30.5);

        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is: %.14f"
                ,firstPoint.getX(),firstPoint.getY(),secondPoint.getX(),secondPoint.getY(),firstPoint.distance(firstPoint,secondPoint));
    }
}
