package week_07.live_class;

public class ProcessingNumber_3_DisplayingArrays {
    public static void main(String[] args) {
        int[] bike = {3, 4, 6, 77, 12, 89, 56};
        for (int i = 0; i < bike.length; i++) {
            System.out.print(bike[i] + " ");
        }
        System.out.println();
        char[] city = {'A','n','k','a','r','a'};
        for (int i = 0; i < city.length ; i++) {
            System.out.print(city[i]);
        }
        System.out.println();
        char[] dreamCity = {'I','s','t','a','n','b','u','l'};
        System.out.print(dreamCity);
    }
}
