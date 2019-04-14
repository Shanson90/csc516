package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class EmployeeMain {

    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        Date date = new Date();
        int i = 0;
        String nextEmpType;
        String newEmpName;
        int newEmpNum;
        char newEmpExt;

        System.out.println("You can enter up to 100 employees. Enter 'done' when finished.");
        Employee[] employees = new Employee[100];
        nextEmpType = "";

        while (!nextEmpType.equals("done") && i < 99) {
            System.out.println("Enter the type of Employee you want to create:");
            System.out.println("(Options are ProductionWorker, ShiftSupervisor, TeamLeader)");
            nextEmpType = keyboard.readLine();
            if(nextEmpType.equals("done")){
                continue;
            }

            newEmpName = getEmpName();
            newEmpNum = getEmpNum();
            newEmpExt = getEmpExt();

            switch (nextEmpType){
                case "ProductionWorker":
                case "TeamLeader":
                    int newEmpShift = getEmpShift();
                    double newEmpRate = getEmpRate();
                    if(nextEmpType.equals("TeamLeader")){
                        int newEmpRequiredTraining = getRequiredTraining();
                        int newEmpBonus = getEmpBonus();
                        employees[i] = new TeamLeader(newEmpName, newEmpNum, newEmpExt, date, newEmpShift, newEmpRate, newEmpRequiredTraining, newEmpBonus);
                        System.out.println("New Team Leader " + employees[i].name + " successfully created!");

                    }else{
                        employees[i] = new ProductionWorker(newEmpName, newEmpNum, newEmpExt, date, newEmpShift, newEmpRate);
                        System.out.println("New Production Worker " + employees[i].name + " successfully created!");

                    }
                    break;
                case "ShiftSupervisor":
                    int newEmpSalary = getEmpSalary();
                    int newEmpBonus = getEmpBonus();
                    employees[i] = new ShiftSupervisor(newEmpName, newEmpNum, newEmpExt, date, newEmpSalary, newEmpBonus);
                    System.out.println("New Shift Supervisor " + employees[i].name + " successfully created!");

                    break;
                default:
                    continue;
            }
            i++;
        }
    }

    private static String getEmpName() throws Exception{
        System.out.println("Enter employee name:");
        return keyboard.readLine();
    }

    private static int getEmpNum() throws Exception{
        System.out.println("Enter employee number:");
        return Integer.parseInt(keyboard.readLine());
    }

    private static char getEmpExt() throws Exception{
        System.out.println("Enter employee extension:");
        return (keyboard.readLine().charAt(0));
    }

    private static int getEmpShift() throws Exception{
        System.out.println("Enter employee shift (1 or 2):");
        return Integer.parseInt(keyboard.readLine());
    }

    private static double getEmpRate() throws Exception{
        System.out.println("Enter employee's hourly rate of pay:");
        return Double.parseDouble(keyboard.readLine());
    }

    private static int getRequiredTraining() throws Exception{
        System.out.println("Enter team leader's annual required training hours:");
        return Integer.parseInt(keyboard.readLine());
    }

    private static int getEmpBonus() throws Exception{
        System.out.println("Enter employee bonus:");
        return Integer.parseInt(keyboard.readLine());
    }

    private static int getEmpSalary() throws Exception{
        System.out.println("Enter employee's annual salary amount (full dollar amounts only):");
        return Integer.parseInt(keyboard.readLine());
    }


}
