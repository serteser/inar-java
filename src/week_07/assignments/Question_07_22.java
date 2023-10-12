package week_07.assignments;

public class Question_07_22 {
    public static void main(String[] args) {
        int[] placeHolder = new int[8];
        for (int i = 0; i < placeHolder.length; i++) {
            placeHolder[i] = i;
        }
        for (int i = placeHolder.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = placeHolder[i];
            placeHolder[i] = placeHolder[j];
            placeHolder[j] = temp;
        }
        for (int i = 0; i < placeHolder.length; i++) {
            System.out.print(placeHolder[i]+ " ");
        }
        for (int i = 0; i < placeHolder.length; i++) {
            placeOfQueenInVerticalLine(placeHolder[i]);
        }
        boolean isQueenTakeUpPosition = false;
        while (!isQueenTakeUpPosition) {
            if (placeHolder[0] == 0) {
                if ((placeHolder[1] == 1) || (placeHolder[2] == 2) || (placeHolder[3] == 3) || (placeHolder[4] == 4) || (placeHolder[5] == 5) || (placeHolder[6] == 6) || (placeHolder[7] == 7)) {
                    break;
                }
            } else if (placeHolder[0]==1) {
                if(placeHolder[1]==0||placeHolder[1]==2||placeHolder[2]==3||placeHolder[3]==4||placeHolder[4]==5||placeHolder[5]==6||placeHolder[6]==7){
                    break;
                }
            } else if (placeHolder[0]==2) {
                if(placeHolder[1]==1||placeHolder[1]==3||placeHolder[2]==0||placeHolder[2]==4||placeHolder[3]==5||placeHolder[4]==6||placeHolder[5]==7){
                    break;
                }
            } else if (placeHolder[0]==3) {
                if(placeHolder[1]==2||placeHolder[1]==4||placeHolder[2]==1||placeHolder[2]==5||placeHolder[3]==0||placeHolder[3]==6||placeHolder[4]==7){
                    break;
                }
            }
            else if (placeHolder[0]==4) {
                if(placeHolder[1]==3||placeHolder[1]==5||placeHolder[2]==2||placeHolder[2]==6||placeHolder[3]==1||placeHolder[3]==7||placeHolder[4]==0){
                    break;
                }
            }
            else if (placeHolder[0]==5) {
                if(placeHolder[1]==4||placeHolder[1]==6||placeHolder[2]==3||placeHolder[2]==7||placeHolder[3]==2||placeHolder[4]==1||placeHolder[5]==0){
                    break;
                }
            }
            else if (placeHolder[0]==6) {
                if(placeHolder[1]==5||placeHolder[1]==7||placeHolder[2]==4||placeHolder[3]==3||placeHolder[4]==2||placeHolder[5]==1||placeHolder[6]==0){
                    break;
                }
            }
            else if (placeHolder[0]==7) {
                if(placeHolder[1]==6||placeHolder[2]==5||placeHolder[3]==4||placeHolder[4]==3||placeHolder[5]==2||placeHolder[6]==1||placeHolder[7]==0){
                    break;
                }
            }
            else if (placeHolder[1] == 0) {
                if ((placeHolder[0] == 1) || (placeHolder[2] == 1) || (placeHolder[3] == 2) || (placeHolder[4] == 3) || (placeHolder[5] == 4) || (placeHolder[6] == 5) || (placeHolder[7] == 6)) {
                    break;
                }
            } else if (placeHolder[1]==1) {
                if(placeHolder[0]==2||placeHolder[2]==0||placeHolder[2]==2||placeHolder[3]==3||placeHolder[4]==4||placeHolder[5]==5||placeHolder[6]==6||placeHolder[7]==7||placeHolder[0]==0){
                    break;
                }
            } else if (placeHolder[1]==2) {
                if(placeHolder[0]==1||placeHolder[0]==3||placeHolder[2]==1||placeHolder[2]==3||placeHolder[3]==0||placeHolder[3]==4||placeHolder[4]==5||placeHolder[5]==6||placeHolder[6]==7){
                    break;
                }
            } else if (placeHolder[1]==3) {
                if(placeHolder[0]==2||placeHolder[0]==4||placeHolder[2]==2||placeHolder[2]==4||placeHolder[3]==1||placeHolder[3]==5||placeHolder[4]==0||placeHolder[4]==6||placeHolder[5]==7){
                    break;
                }
            }
            else if (placeHolder[1]==4) {
                if(placeHolder[0]==3||placeHolder[0]==5||placeHolder[2]==3||placeHolder[2]==5||placeHolder[3]==2||placeHolder[3]==6||placeHolder[4]==1||placeHolder[4]==7||placeHolder[5]==0){
                    break;
                }
            }
            else if (placeHolder[1]==5) {
                if(placeHolder[0]==4||placeHolder[0]==6||placeHolder[2]==4||placeHolder[2]==6||placeHolder[3]==3||placeHolder[3]==7||placeHolder[4]==2||placeHolder[5]==1||placeHolder[6]==0){
                    break;
                }
            }
            else if (placeHolder[1]==6) {
                if(placeHolder[0]==5||placeHolder[0]==7||placeHolder[2]==5||placeHolder[2]==7||placeHolder[3]==4||placeHolder[4]==3||placeHolder[5]==2||placeHolder[6]==1||placeHolder[7]==0){
                    break;
                }
            }
            else if (placeHolder[1]==7) {
                if(placeHolder[0]==6||placeHolder[2]==6||placeHolder[3]==5||placeHolder[4]==4||placeHolder[5]==3||placeHolder[6]==2||placeHolder[7]==1){
                    break;
                }
            }
            else if (placeHolder[2] == 0) {
                if ((placeHolder[1] == 1) || (placeHolder[0] == 2) || (placeHolder[3] == 1) || (placeHolder[4] == 3) || (placeHolder[4] == 2) || (placeHolder[5] == 3) || (placeHolder[6] == 4)|| (placeHolder[7] == 5)) {
                    break;
                }
            } else if (placeHolder[2]==1) {
                if(placeHolder[1]==0||placeHolder[1]==2||placeHolder[0]==3||placeHolder[3]==0||placeHolder[3]==2||placeHolder[4]==3||placeHolder[5]==4||placeHolder[6]==5||placeHolder[7]==6){
                    break;
                }
            } else if (placeHolder[2]==2) {
                if(placeHolder[1]==1||placeHolder[1]==3||placeHolder[0]==0||placeHolder[0]==4||placeHolder[3]==1||placeHolder[3]==3||placeHolder[4]==0||placeHolder[4]==4||placeHolder[5]==5|| placeHolder[6] == 6|| placeHolder[7] == 7){
                    break;
                }
            } else if (placeHolder[2]==3) {
                if(placeHolder[1]==2||placeHolder[1]==4||placeHolder[0]==1||placeHolder[0]==5||placeHolder[3]==2||placeHolder[3]==4||placeHolder[4]==1||placeHolder[4]==5||placeHolder[5]==0|| (placeHolder[5] == 6||placeHolder[6]==7)){
                    break;
                }
            }
            else if (placeHolder[2]==4) {
                if(placeHolder[1]==3||placeHolder[1]==5||placeHolder[0]==2||placeHolder[0]==6||placeHolder[3]==3||placeHolder[3]==5||placeHolder[4]==2||placeHolder[4]==6||placeHolder[5]==1|| placeHolder[5] == 7|| placeHolder[6] == 0){
                    break;
                }
            }
            else if (placeHolder[2]==5) {
                if(placeHolder[1]==4||placeHolder[1]==6||placeHolder[0]==3||placeHolder[0]==7||placeHolder[3]==4||placeHolder[3]==6||placeHolder[4]==3||placeHolder[4]==7||placeHolder[5]==2|| placeHolder[6] == 1|| placeHolder[7] == 0){
                    break;
                }
            }
            else if (placeHolder[2]==6) {
                if(placeHolder[1]==5||placeHolder[1]==7||placeHolder[0]==4||placeHolder[3]==5||placeHolder[3]==7||placeHolder[4]==4||placeHolder[5]==3||placeHolder[6]==2||placeHolder[7]==1){
                    break;
                }
            }
            else if (placeHolder[2]==7) {
                if(placeHolder[1]==6||placeHolder[0]==5||placeHolder[3]==6||placeHolder[4]==5||placeHolder[5]==4||placeHolder[6]==3||placeHolder[7]==1|| placeHolder[7] == 2){
                    break;
                }
            }else{
                isQueenTakeUpPosition=true;
            }
        }

    }

    public static void placeOfQueenInVerticalLine(int place) {
        switch (place) {
            case 0:
                System.out.print("\n|Q| | | | | | | |");
                break;
            case 1:
                System.out.print("\n| |Q| | | | | | |");
                break;
            case 2:
                System.out.print("\n| | |Q| | | | | |");
                break;
            case 3:
                System.out.print("\n| | | |Q| | | | |");
                break;
            case 4:
                System.out.print("\n| | | | |Q| | | |");
                break;
            case 5:
                System.out.print("\n| | | | | |Q| | |");
                break;
            case 6:
                System.out.print("\n| | | | | | |Q| |");
                break;
            case 7:
                System.out.print("\n| | | | | | | |Q|");
                break;
        }
    }


}
