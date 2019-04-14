package homework;

import java.util.Date;

public class Employee {

    public String name;
    public String number;
    public Date hireDate;

    public Employee(String eName, int eNum, char eExt, Date eHireDate){
        if(!isValid(eExt)){
            throw new IllegalArgumentException("Employee extension must be in the alphabetic range A-M.");
        }

        if(!isValid(eNum)){
            throw new IllegalArgumentException("Employee number must be in the range 0-999.");
        }

        name = eName;
        number = eNum + "-" + Character.toUpperCase(eExt);
        hireDate = eHireDate;
    }

    private boolean isValid(char eExt){
        return eExt < 'N';
    }

    private boolean isValid(int n){
        return n > 0 && n < 1000;
    }
}
