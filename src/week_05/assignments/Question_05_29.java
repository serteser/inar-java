package week_05.assignments;

import java.util.Scanner;

public class Question_05_29 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter first day of year: ");
        int dayi = input.nextInt();
        int day;
        System.out.println("January " + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");

            if (dayi==0){
                System.out.print("");//1
            }else if(dayi==1){
                System.out.print("       ");//7
            }else if(dayi==2){
                System.out.print("           ");//13
            }else if(dayi==3){
                System.out.print("                   ");//19
            }else if(dayi==4){
                System.out.print("                        ");//25
            }
            else if (dayi==5){
                System.out.print("                              ");//31
            }else if(dayi==6){
                System.out.print("                                     ");//37
            }

            for(int i=1; i<=31; i++){
                System.out.printf("%2d    ", i);
                if (dayi==0&&i%7==0){
                    System.out.println();
                }if ((dayi==1&&i==6)||(dayi==1&&i==13)||(dayi==1&&i==20)||(dayi==1&&i==27)){
                    System.out.println();
                }if ((dayi==2&&i==5)||(dayi==2&&i==12)||(dayi==2&&i==19)||(dayi==2&&i==26)){
                    System.out.println();
                }if ((dayi==3&&i==4)||(dayi==3&&i==11)||(dayi==3&&i==18)||(dayi==3&&i==25)){
                    System.out.println();
                }if ((dayi==4&&i==3)||(dayi==4&&i==10)||(dayi==4&&i==17)||(dayi==4&&i==24)){
                    System.out.println();
                }if ((dayi==5&&i==2)||(dayi==5&&i==9)||(dayi==5&&i==16)||(dayi==5&&i==23)||(dayi==5&&i==30)){
                    System.out.println();
                }if ((dayi==6&&i==1)||(dayi==6&&i==8)||(dayi==6&&i==15)||(dayi==6&&i==22)||(dayi==6&&i==29)){
                    System.out.println();
                }

        }
        System.out.println();
        System.out.println("February " + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(31+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=28; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("March " + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(59+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=31; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("April " + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(90+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=30; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("May" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(121+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=31; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("June" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(151+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=30; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("July" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(182+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=31; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("August" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(213+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=31; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("September" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(243+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=30; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("October" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(274+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=31; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("November" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(304+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=30; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("December" + year);
        for(int j =1 ; j<=50 ;j++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
        day=(335+dayi)%7;
        if (day==0){
            System.out.print("");//1
        }else if(day==1){
            System.out.print("       ");//7
        }else if(day==2){
            System.out.print("           ");//13
        }else if(day==3){
            System.out.print("                   ");//19
        }else if(day==4){
            System.out.print("                        ");//25
        }
        else if (day==5){
            System.out.print("                               ");//31
        }else if(day==6){
            System.out.print("                                     ");//37
        }

        for(int i=1; i<=31; i++){
            System.out.printf("%2d    ", i);

            if (day==0&&i%7==0){
                System.out.println();
            }if ((day==1&&i==6)||(day==1&&i==13)||(day==1&&i==20)||(day==1&&i==27)){
                System.out.println();
            }if ((day==2&&i==5)||(day==2&&i==12)||(day==2&&i==19)||(day==2&&i==26)){
                System.out.println();
            }if ((day==3&&i==4)||(day==3&&i==11)||(day==3&&i==18)||(day==3&&i==25)){
                System.out.println();
            }if ((day==4&&i==3)||(day==4&&i==10)||(day==4&&i==17)||(day==4&&i==24)){
                System.out.println();
            }if ((day==5&&i==2)||(day==5&&i==9)||(day==5&&i==16)||(day==5&&i==23)||(day==5&&i==30)){
                System.out.println();
            }if ((day==6&&i==1)||(day==6&&i==8)||(day==6&&i==15)||(day==6&&i==22)||(day==6&&i==29)){
                System.out.println();
            }

        }
    }
}
