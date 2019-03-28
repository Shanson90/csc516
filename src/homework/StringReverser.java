package homework;

public class StringReverser {

    public static String reverse(String original){
        if(original.equals("")){
            return "";
        }

        String reversed = "";
        reversed += original.charAt(original.length() - 1);
        original = original.substring(0, original.length() - 1);

        if(reversed.length() <= original.length()){
            reversed += reverse(original);
        }

        return reversed;
    }
}
