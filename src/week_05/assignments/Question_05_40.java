package week_05.assignments;

public class Question_05_40 {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;

        for (int i = 1 ; i<=1_000_000 ; i++){
            int headOrTail = (int) (Math.random()*2);
            if(headOrTail==0){
                head++;
            }else{
                tail++;
            }
        }
        System.out.printf("Flipping a coin one million times..\nHeads: %d\nTails: %d",head, tail);
    }
}
