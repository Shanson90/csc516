package homework;

import java.util.Date;

public class ShiftSupervisor extends Employee {

    public int annualSalary;
    public int annualBonus;

    public ShiftSupervisor(String eName, int eNum, char eExt, Date eHireDate, int eSalary, int eBonus) {
        super(eName, eNum, eExt, eHireDate);
        if(eSalary < 0 || eBonus < 0){
            throw new IllegalArgumentException("Salary and Bonus should be positive numbers.");
        }
        annualSalary = eSalary;
        annualBonus = eBonus;
    }

    public int getSalary(){
        return annualSalary;
    }

    public int getAnnualBonus(){
        return annualBonus;
    }

    public void setAnnualSalary(int eSalary){
        annualSalary = eSalary;
    }

    public void setAnnualBonus(int eBonus){
        annualSalary = eBonus;
    }

}
