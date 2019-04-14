package homework;

import java.util.Date;

public class ProductionWorker extends Employee {

    public int shift;
    public double payRate;

    public ProductionWorker(String eName, int eNum, char eExt, Date eHireDate, int eShift, double eRate) {
        super(eName, eNum, eExt, eHireDate);
        if(eShift != 1 && eShift != 2){
            throw new IllegalArgumentException("Shift should be 1 or 2.");
        }
        shift = eShift;
        payRate = eRate;
    }

    public int getShift(){
        return shift;
    }

    public double getPayRate(){
        return payRate;
    }

    public void setShift(int eShift){
        shift = eShift;
    }

    public void setPayRate(double eRate){
        payRate = eRate;
    }
}
