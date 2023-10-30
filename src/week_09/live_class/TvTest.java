package week_09.live_class;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        Tv tv2 = new Tv();
        tv2.turnOn();
        System.out.println("Tv2's current channel ==> " + tv2.channel);
        tv2.channelUp();
        tv2.channelUp();
        System.out.println("Tv2's current volume level ==> " + tv2.volumeLevel);
        tv2.volumeLevelUp();
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
        System.out.println("**********************************");
        System.out.println(Circle.getNumberOfObjects());
    }
}
