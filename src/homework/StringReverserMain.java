package homework;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReverserMain {

    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        System.out.println("Enter string to reverse");
        String original = keyboard.readLine();
        String reversed = StringReverser.reverse(original);
        System.out.println("Your string in reverse:");
        System.out.println(reversed);
    }
}
