package week_09.live_class;

public class BicycleTest {
    public static void main(String[] args) {


        Bicycle myBicycle = new Bicycle();
        Bicycle myWifeBike = new Bicycle("soul-rider", "gravel", "chain", 10.3, 10, true);


        System.out.println(myWifeBike.gear);


        System.out.println(myWifeBike.typeOfBike);


        System.out.println(myWifeBike.tradeMark);


        System.out.println(myWifeBike.specifiedFeatures);


        System.out.println(myWifeBike.isAcceptableWeight);

        //myWifeBike.getGearDown(8);

    }
}
