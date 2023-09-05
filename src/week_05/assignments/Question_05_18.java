package week_05.assignments;

public class Question_05_18 {
    public static void main(String[] args) {
        int stair = 6;
        // Pattern A;
        for (int i=1 ; i<=stair ; i++){

            for(int j=1 ; j<=i ; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Separate line;
        for (int i =1 ; i<=50 ; i++){
            System.out.print("-");
        }
        System.out.println();
        // Pattern B;
        for (int i=0 ; i<stair ; i++){

            for(int j=1 ; j<=stair-i ; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Separate line;
        for (int i =1 ; i<=50 ; i++){
            System.out.print("-");
        }
        System.out.println();
        // Pattern C;
        for (int i=1 ; i<=stair ; i++){
            int capture =i;
            for(int j=1 ; j<=stair-i ; j++ ){
                System.out.print("  ");
            }
            for (int k =1; k<=i ; i--){
                System.out.print(i+ " ");

            }
            System.out.println();
            i=capture;
        }
        // Separate line;
        for (int i =1 ; i<=50 ; i++){
            System.out.print("-");
        }
        System.out.println();
        // Pattern D;
        for (int i=0 ; i<stair ; i++){

            for(int j=1 ; j<=i ; j++ ){
                System.out.print("  ");
            }
            for (int k =1; k<=stair-i ; k++){
                System.out.print(k+ " ");

            }
            System.out.println();

        }

    }
}
