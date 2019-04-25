package homework;


public class StringTreeNode {
    String val;
    StringTreeNode left;
    StringTreeNode right;
    boolean isOperator;

    StringTreeNode(String x) {
        val = x;
    }

    public static void add(StringTreeNode root, StringTreeNode newNode) {
        if (root != null) {
            if (root.left == null) {
                root.left = newNode;
            } else if (root.right == null) {
                root.right = newNode;
            } else {
                if (height(root.right) > height(root.left)) {
                    add(root.left, newNode);
                } else {
                    add(root.right, newNode);
                }
            }
        }
    }

    public int calcHelper(StringTreeNode root) {
        if (root.left == null && root.right == null) {
            return Integer.parseInt(root.val);
        } else {
            int l = calcHelper(root.left);
            int r = calcHelper(root.right);
            if (root.val.equals("+")) {
                return l + r;
            } else {
                return l * r;
            }
        }
    }

    private static int height(StringTreeNode root) {
        return getHeight(root, 0);
    }

    private static int getHeight(StringTreeNode root, int currentHeight) {
        if (root == null) {
            return currentHeight;
        }
        currentHeight++;
        getHeight(root.left, currentHeight);
        return getHeight(root.right, currentHeight);
    }
}
