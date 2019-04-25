package homework;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode convert(int[] nums) {
        TreeNode root = sortedAdd(nums, 0, nums.length - 1);
        return root;
    }

    private static TreeNode sortedAdd(int[] nums, int start, int end) {

        if (start > end) {
            return null;
        }

        int midIndex = start + (end - start) / 2;
        int val = nums[midIndex];

        TreeNode node = new TreeNode(val);
        node.left = sortedAdd(nums, start, midIndex - 1);
        node.right = sortedAdd(nums, midIndex + 1, end);

        return node;
    }

    public static void print(TreeNode root){
        if(root == null){return;}
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
}
