package homework;

import java.util.Date;

public class TeamLeader extends ProductionWorker {

    public int requiredTrainingHrs;
    public int accumulatedTrainingHrs = 0;
    public int monthlyBonus;


    public TeamLeader(String eName, int eNum, char eExt, Date eHireDate, int eShift, double eRate){
        super(eName, eNum, eExt, eHireDate, eShift, eRate);
    }

    public TeamLeader(String eName, int eNum, char eExt, Date eHireDate, int eShift, double eRate, int eRequiredTrainingHrs, int eMonthlyBonus){
        super(eName, eNum, eExt, eHireDate, eShift, eRate);
        requiredTrainingHrs = eRequiredTrainingHrs;
        monthlyBonus = eMonthlyBonus;
    }

    public int getRequiredTrainingHrs(){
        return requiredTrainingHrs;
    }

    public int getAccumulatedTrainingHrs(){
        return accumulatedTrainingHrs;
    }

    public void setRequiredTrainingHrs(int hrs){
        requiredTrainingHrs = hrs;
    }

    public void addAccumulatedTrainingHrs(int hrsToAdd){
        accumulatedTrainingHrs += hrsToAdd;
    }

    public void resetAccumulatedTrainingHrs(){
        accumulatedTrainingHrs = 0;
    }

    public void resetAccumulatedTrainingHrs(int newTotalHrs){
        accumulatedTrainingHrs = newTotalHrs;
    }

}
