package week_05.assignments;

public class Question_05_43 {
    public static void main(String[] args) {
        int count=0;
        for(int i = 1, j=2; j<=7; j++){
            System.out.print(i + " " +j +"\n");
            count++;
            if(i==1&&j==7){
                i=2;
                j=2;
            }else if (i==2&&j==7){
                i=3;
                j=3;
            }else if(i==3&&j==7){
                i=4;
                j=4;
            }else if(i==4&&j==7){
                i=5;
                j=5;
            }else if(i==5&&j==7){
                i=6;
                j=6;
            }
        }
        System.out.printf("The total number of all combinations is %d", count);
    }
}
