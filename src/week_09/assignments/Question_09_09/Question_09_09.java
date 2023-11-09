package week_09.assignments.Question_09_09;

public class Question_09_09 {
    public static void main(String[] args) {

        umlDraw();
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("First RegularPolygon perimeter is  : %.1f   area is : %.15f\n" +
                        "Second RegularPolygon perimeter is : %.1f  area is : %.15f\n" +
                        "Third RegularPolygon perimeter is  : %.1f  area is : %.15f", polygon1.getPerimeter(), polygon1.getArea(), polygon2.getPerimeter()
                , polygon2.getArea(), polygon3.getPerimeter(), polygon3.getArea());
    }

    public static void umlDraw() {
        System.out.printf("\n\t\tRegularPolygon\n------------------------------\n-n    : int\n-side : double" +
                "\n-x    : double\n-y    : double\n------------------------------\n+RegularPolygon()\n+RegularPolygon(n: int, side: double)" +
                "\n+RegularPolygon(n: int, side: double, x: double, y: double)\n------------------------------\nThe accessor and mutator methods for all data fields" +
                "\ngetPerimeter(): double\ngetArea()     : double");
        System.out.println();
        System.out.println();
    }

}
