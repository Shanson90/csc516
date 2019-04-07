package homework;

import java.util.ArrayList;

public class GeneologyPerson {

    public String name;
    public int descendantCount;
    public ArrayList<String> descendants;

    public GeneologyPerson(String n){
        name = n;
        descendants = new ArrayList<>();
        descendantCount = 0;
    }

}
