package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class DelimiterMain {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\gitPersonal\\ParenthesesTestCase.text");
        DelimiterChecker checker = new DelimiterChecker(file);

        String validText = checker.validPortion();
        System.out.print(validText);
    }
}