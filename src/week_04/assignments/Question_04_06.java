package week_04.assignments;

public class Question_04_06 {
    public static void main(String[] args){

        double angleRandom1 = Math.random()*2*Math.PI;
        double angleRandom2 = Math.random()*2*Math.PI;
        double angleRandom3 = Math.random()*2*Math.PI;

        int radius = 40;

        double x1 = radius * Math.cos(angleRandom1);
        double y1 = radius * Math.sin(angleRandom1);
        double x2 = radius * Math.cos(angleRandom2);
        double y2 = radius * Math.sin(angleRandom2);
        double x3 = radius * Math.cos(angleRandom3);
        double y3 = radius * Math.sin(angleRandom3);

        double a = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double c = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + "  " + Math.round(angleB * 100) / 100.0 + "  "
                + Math.round(angleC * 100) / 100.0);



    }
}
