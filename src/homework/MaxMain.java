package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxMain {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        System.out.println("Enter up to 100 integers, entering 'done' when ready to find the max.");
        int[] nums = new int[100];
        int i = 0;

        String nextInt = keyboard.readLine();
        while (!nextInt.equals("done")){
            nums[i] = (Integer.parseInt(nextInt));
            i++;
            nextInt = keyboard.readLine();
        }

        int max = Max.find(nums);
        System.out.println("The max int was: " + max);
    }
}
