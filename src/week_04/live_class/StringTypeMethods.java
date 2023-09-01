package week_04.live_class;

public class StringTypeMethods {
    public static void main (String[] args){

        String message = "Welcome to java";
        System.out.println("The length of " + message + " is " + message.length());
        System.out.println(message.charAt(message.length()-1));
        String s1, s2, s3, s4, s5;
        int e = 5;
        String fiveStars = "5";
        String tenStars = "10";
        s5 = " Academy! ";
        s4 = " Inar ";
        s3 = " love ";
        s2 = " I ";
        s1 = s2 + s3 +s4 + s5 + fiveStars ;
        System.out.println(s1);
        s1 = s2.concat(s3.concat(s5.concat(s4.concat(fiveStars))));
        System.out.println(s1);
        System.out.println(e + 10);
        String joy = " and java is fun!";
        String compound = message.concat(joy);
        compound = message + joy + message;
        System.out.println(compound.length());
        System.out.println(compound);
        System.out.println(compound.charAt(33));
        System.out.println(((fiveStars + tenStars)));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.trim());
        System.out.println(compound.charAt(compound.length()-1));
        char r = compound.charAt(8);
        System.out.println(r +5);






    }
}
