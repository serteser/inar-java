package week_04.live_class;

public class ComparingStrings {
    public static void main(String[] args){

        String my =  "My touring bike is KOGA.";
        String her = "My touring bike is KOGA.";
        //She has two bikes. One is Soulrider the other one is Brompton.
        if (my==her){
            System.out.println("The two referenceVariables are the same.");
        }else{
            System.out.println("The two referenceVariables are NOT the same.");
        }

        System.out.println(my!=her ? "The two referenceVariables are NOT the same" : "The two referenceVariables are the same.");

        if (my.equalsIgnoreCase(her)){
            System.out.println("The two referenceVariables are the same.");
        }else{
            System.out.println("The two referenceVariables are NOT the same.");
        }
        System.out.println("******************************");
        System.out.println(her.compareTo(my));
        System.out.println(her.compareToIgnoreCase(my));
        System.out.println(my.equals(her));
        System.out.println(my.equalsIgnoreCase(her));
        System.out.println("*******************************");
        System.out.println(her.startsWith("my"));
        System.out.println(her.startsWith("My"));
        System.out.println(her.endsWith("KOGA."));
        System.out.println(her.endsWith("KoGa"));
        System.out.println("*******************************");
        System.out.println(my.contains("ouring"));
        System.out.println(my.contains("Brompton"));
        System.out.println("----------------------------------");
        System.out.println("is my equal to her ? " + (my == her ? "yes" : "no"));
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("is my equal to her ? " + (my.equals(her) ? "yes" : "no"));
        System.out.println("----------------------------------");




    }
}
