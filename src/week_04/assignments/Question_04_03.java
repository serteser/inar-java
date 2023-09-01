package week_04.assignments;
//import java.util.Scanner;
public class Question_04_03 {
    public static void main(String [] args){
        //Scanner input = new Scanner (System.in);
        //System.out.println("Enter the coordinates of four points separated (e.g. (x,y)): ");
        double atlantaX = Math.toRadians(33.7489954);
        double atlantaY = Math.toRadians(-84.3879824);
        double orlandoX = Math.toRadians(28.5383355);
        double orlandoY = Math.toRadians(-81.3792364999);
        double savannahX = Math.toRadians(32.0835407);
        double savannahY = Math.toRadians(-81.09983419999998);
        double charlotteX = Math.toRadians(35.2270869);
        double charlotteY = Math.toRadians(-80.84312669999997);
        double radius = 6371.01; // The average earth radius

        double distanceSavannahToOrlando = radius * Math.acos((Math.sin(savannahX)*Math.sin(orlandoX))+
                (Math.cos(savannahX)*Math.cos(orlandoX)*Math.cos(savannahY-orlandoY)));
        double distanceSavannahToAtlanta = radius * Math.acos((Math.sin(savannahX)*Math.sin(atlantaX))+
                (Math.cos(savannahX)*Math.cos(atlantaX)*Math.cos(savannahY-atlantaY)));
        double distanceSavannahToCharlotte = radius * Math.acos((Math.sin(savannahX)*Math.sin(charlotteX))+
                (Math.cos(savannahX)*Math.cos(charlotteX)*Math.cos(savannahY-charlotteY)));
        double distanceAtlantaToOrlando = radius * Math.acos((Math.sin(atlantaX)*Math.sin(orlandoX))+
                (Math.cos(atlantaX)*Math.cos(orlandoX)*Math.cos(atlantaY-orlandoY)));
        double distanceAtlantaToCharlotte = radius * Math.acos((Math.sin(atlantaX)*Math.sin(charlotteX))+
                (Math.cos(atlantaX)*Math.cos(charlotteX)*Math.cos(atlantaY-charlotteY)));

        double sEast = (distanceSavannahToCharlotte +
                distanceAtlantaToCharlotte + distanceSavannahToAtlanta)/2; //"sEast" half of the circumference of the triangle at east.
        double areaEast = Math.pow((sEast*(sEast-distanceSavannahToCharlotte)* //"areaEast" half of the area of the square at east.
                (sEast-distanceAtlantaToCharlotte)*(sEast-distanceSavannahToAtlanta)),0.5);

        double sWest = (distanceSavannahToOrlando +
                distanceAtlantaToOrlando + distanceSavannahToAtlanta)/2; //"sWest" half of the circumference of the triangle at west.
        double areaWest = Math.sqrt((sWest*(sWest-distanceSavannahToOrlando)* //"areaWest" half of the area of the square at west.
                (sWest-distanceAtlantaToOrlando)*(sWest-distanceSavannahToAtlanta)));

        double sumArea = areaEast + areaWest; // "sumArea" area of square

        System.out.println(areaEast+ " / " + areaWest);

        System.out.println("Estimated area enclosed by these four cities :" + sumArea );


    }
}
