package week_13.live_class;

public class DetectingDuplicateString {
    public static void main(String[] args) {

        String s = "Cac/tus,/";
        if(isDuplicate(s)){
            System.out.println("Yes it has duplicate character(s).");
        }else{
            System.out.println("No it is has not duplicate character(s).");
        }
    }

    public static boolean isDuplicate(String s) {

        boolean[] result = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result[ch]) {

                return true;
            }else{

                result[ch] = true;
            }
        }
        return false;
    }
}
