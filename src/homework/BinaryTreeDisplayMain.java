package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class BinaryTreeDisplayMain {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\gitPersonal\\BinaryTreeInput.text");

        BinaryTreeReader binaryTreeReader = new BinaryTreeReader(file);
        binaryTreeReader.readFile();

        String output;
        output = binaryTreeReader.getTree(binaryTreeReader.people.get(0).name);

        System.out.print(output + "\n\n");
    }
}
