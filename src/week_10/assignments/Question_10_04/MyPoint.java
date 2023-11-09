package week_10.assignments.Question_10_04;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){}
    public MyPoint(double x, double y){
        this.x=x;
        this.y=y;
    }


    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(MyPoint f,MyPoint s){
        return Math.sqrt((s.getX() - f.getX()) * (s.getX() - f.getX()) + (s.getY() - f.getY()) * (s.getY() - f.getY()));
    }
    public double distance(MyPoint f, double x, double y){
        return Math.sqrt((x - f.getX()) * (x - f.getX()) + (y - f.getY()) * (y - f.getY()));
    }
}
