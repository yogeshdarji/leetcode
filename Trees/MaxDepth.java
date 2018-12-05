package Trees;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String args[]){

        TreeNode root = new TreeNode(1);
        TreeNode rl = root.left = new TreeNode(2);
        TreeNode rr = root.right = new TreeNode(3);
        rr.left = new TreeNode(4);
        rr.right = new TreeNode(5);
        //rr.left = new TreeNode(12);

        System.out.println(maxDepth(root));
    }
}
