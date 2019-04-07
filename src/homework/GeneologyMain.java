package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class GeneologyMain {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\gitPersonal\\GeneologyData.text");
        System.out.println("Enter parent for test:");
        String parent = keyboard.readLine();
        System.out.println("Enter descendant for test:");
        String child = keyboard.readLine();

        GeneologyReader geneologyReader = new GeneologyReader(file);
        geneologyReader.readFile();

        String output;
        if (geneologyReader.isDescendant(parent, child)){
            output = geneologyReader.getFamilyTree(parent);
        }else{
            output = child + " is not a descendant of " + parent;
        }

        System.out.print(output + "\n\n");
    }
}
