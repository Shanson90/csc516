package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GeneologyReader {

    BufferedReader reader;
    ArrayList<GeneologyPerson> people = new ArrayList<>();
    int printLevel = 0;

    public GeneologyReader(File f) throws Exception {
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
            GeneologyPerson person = new GeneologyPerson(words[0]);
            person.descendantCount = Integer.parseInt(words[1]);

            for(int i = 2; i < words.length; i++){
                person.descendants.add(words[i]);
            }
            people.add(person);
        }
    }

    public boolean isDescendant(String parent, String child){
        for(GeneologyPerson person : people){
            if(person.name.equals(parent)){
                for(String des : person.descendants){
                    if(des.equals(child)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public String getFamilyTree(String name) {
        for (GeneologyPerson person : people) {
            if (person.name.equals(name)) {
                return getTree(person);
            }
        }
        return name + " not found in data.";
    }

    private String getTree(GeneologyPerson person){
        StringBuilder tree = new StringBuilder();
        tree.append("\n");
        for(int i = 0; i < printLevel; i++){
            tree.append("  ");
        }
        tree.append(person.name);

        if(person.descendantCount > 0){
            printLevel++;
            for(String desc : person.descendants){
                tree.append(getFamilyTree(desc));
            }
            printLevel--;
        }

        return tree.toString();
    }
}
