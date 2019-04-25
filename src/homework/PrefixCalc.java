package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrefixCalc {
    private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Enter prefix expression:");
        String input = keyboard.readLine();
        String[] inputs = input.split(" ");
        StringTreeNode root = new StringTreeNode("");

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].equals("*") || inputs[i].equals("+")) {
                if (root.val.equals("")) {
                    root.val = inputs[i];
                    root.isOperator = true;
                } else {
                    StringTreeNode newNode = new StringTreeNode(inputs[i]);
                    newNode.isOperator = true;
                    StringTreeNode.add(root, newNode);
                }
            }
        }

        for (int i = 0; i < inputs.length; i++) {
            StringTreeNode newNode = new StringTreeNode(inputs[i]);
            if (newNode.val.equals("*") || newNode.val.equals("+")) {
                continue;
            }
            StringTreeNode.add(root, newNode);
        }

        System.out.println(root.calcHelper(root));
    }


}
