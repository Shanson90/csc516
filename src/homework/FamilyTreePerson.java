package homework;

public class FamilyTreePerson {

    public String name;
    public FamilyTreePerson firstBorn;
    public FamilyTreePerson youngest;

    public FamilyTreePerson(String n) {
        name = n;
    }

    public void addChild(String name) {
        if (firstBorn == null) {
            firstBorn = new FamilyTreePerson(name);
        } else {
            youngest = new FamilyTreePerson(name);
        }
    }

}
