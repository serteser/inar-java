package week_11.live_class;

public class Constructors extends MainConstructors{
     Constructors(int number){

    }
}
class MainConstructors{
    public MainConstructors(){

    }
}
 class Test{
     public static void main(String[] args) {
         Constructors constructors = new Constructors(9);
     }
     public void get(){
         int result = 5*4;


         System.out.println(result);
     }
 }

