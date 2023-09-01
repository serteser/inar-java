package week_04.live_class;
import java.util.Scanner;
public class ObtainingSubstrings {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println();
        String java = "Welcome to java and it is fun.";
        System.out.println(java.substring(16,25));
        String subJava = java.substring(7);
        System.out.println(subJava);

        int cut = java.indexOf(' ');
        System.out.println(cut);
        System.out.println("000000000000000000000000000000000");
        String firstName = java.substring(0,cut);
        String secondName = java.substring(cut+1);
        System.out.println("Let's say altogether; " + firstName+ " " +secondName);

        System.out.println(Math.pow(2,9));
        if(java.contains("ando")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        System.out.println(java.indexOf(' '));
        System.out.println(java.charAt(4));
        System.out.println(java.indexOf("and"));
        System.out.println(java.lastIndexOf(" ",8));
        System.out.println("***************************");
        System.out.println(java.lastIndexOf("el",9));
        System.out.println("****************************");
        System.out.println(java.indexOf("Java",5));
        System.out.println(java.indexOf("java",5));
        //System.out.println("***************************************");
        //System.out.println(java.lastIndexOf("W"));
        //System.out.println(java.lastIndexOf("o"));
        //System.out.println(java.lastIndexOf("o",5));
        //System.out.println(java.lastIndexOf("W"));
        //System.out.println(java.lastIndexOf("W"));
    }
}
