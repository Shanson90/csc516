package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class BalancedSearchTree {

    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int inputNum = getNum();
        int[] nums = new int[inputNum];
        Random rand = new Random();

        for(int i = 0; i < inputNum; i++){
            nums[i] = (rand.nextInt(100));
        }

        IntInsertionSorter.insertionSort(nums);
        TreeNode root = TreeNode.convert(nums);
        TreeNode.print(root);
    }

    private static int getNum() throws Exception{
        System.out.println("Enter number:");
        return Integer.parseInt(keyboard.readLine());
    }
}
