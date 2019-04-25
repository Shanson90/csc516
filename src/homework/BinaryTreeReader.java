package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class BinaryTreeReader {

    BufferedReader reader;
    ArrayList<FamilyTreePerson> people = new ArrayList<>();
    int printLevel = 0;

    public BinaryTreeReader(File f) throws Exception {
        reader = new BufferedReader(new FileReader(f.getAbsolutePath()));
    }

    public void readFile() throws Exception {
        int numLines = Integer.MAX_VALUE;
        int lineNum = 0;
        while(lineNum < numLines){
            lineNum++;
            String line = reader.readLine();
            if(lineNum == 1){
                numLines = Integer.parseInt(line) + 1;
                continue;
            }
            String[] words = line.split("\\s+");
            FamilyTreePerson person = new FamilyTreePerson(words[0]);

            for(int i = 1; i < words.length; i++){
                person.addChild(words[i]);
            }
            people.add(person);
        }
    }

    public String getTree(String name) {
        for (FamilyTreePerson person : people) {
            if (person.name.equals(name)) {
                return getTree(person);
            }
        }
        return name + " not found in data.";
    }

    private String getTree(FamilyTreePerson person){
        StringBuilder tree = new StringBuilder();
        tree.append("\n");
        for(int i = 0; i < printLevel; i++){
            tree.append("  ");
        }
        tree.append(person.name);

        if(person.firstBorn != null || person.youngest != null){
            printLevel++;
            if(person.firstBorn != null){
                tree.append(getTree(person.firstBorn.name));
            }
            if(person.youngest != null){
                tree.append(getTree(person.youngest.name));
            }
            printLevel--;
        }

        return tree.toString();
    }
}
