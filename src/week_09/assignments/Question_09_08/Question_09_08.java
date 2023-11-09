package week_09.assignments.Question_09_08;


public class Question_09_08 {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setIsOn(true);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setRadius(10);

        Fan fan2 = new Fan();
        fan2.setIsOn(false);
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setRadius(5);

        umlDraw();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());


    }

    public static void umlDraw() {
        System.out.printf("\n\t\t\tFan\n-------------------------\n-speed : int\n-isOn  : boolean" +
                "\n-radius: double\n-color : String\n-------------------------\n+Fan()\n");
        System.out.println();
        System.out.println();
    }
}
