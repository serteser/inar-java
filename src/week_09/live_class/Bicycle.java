package week_09.live_class;

public class Bicycle {

    String tradeMark;
    String typeOfBike;
    String specifiedFeatures;
    double weight;
    int gear;
    boolean isAcceptableWeight;

    Bicycle() {
    }

    Bicycle(String tradeMark, String typeOfBike, String specifiedFeatures, double weight, int gear, boolean isAcceptableWeight) {
        this.tradeMark = tradeMark;
        this.weight = weight;
        this.gear = gear;
        this.specifiedFeatures = specifiedFeatures;
        this.typeOfBike = typeOfBike;
        this.isAcceptableWeight = isAcceptableWeight;
    }

    int getGearUp(int gear) {
        if (0 < gear && gear < 15) {
            gear++;
        }
        return gear;
    }

    int getGearDown(int gear) {

        if (0 < gear && gear < 15) {
            gear--;
        } else {
            System.out.println("the gear is not between the limits of allowed");
        }
        return gear;
    }

    double getWeight(double userWeight, double loaded) {
        return userWeight + loaded + weight;
    }

    boolean isAcceptableWeight(double weight) {
        return weight < 125;
    }


}
