package Trees;

public class sumRootToLeaf {

    public static int sumNumbers(TreeNode root) {

        return helper(root, 0);
    }

    static int  helper(TreeNode root, int sum){
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return sum*10 + root.val;

       return helper(root.left, sum*10 + root.val) + helper(root.right,  sum = sum*10 + root.val);

    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        TreeNode rl = root.left = new TreeNode(9);
        TreeNode rr = root.right = new TreeNode(0);
        rl.left = new TreeNode(1);
        rl.right = new TreeNode(5);

      //  rr.right = new TreeNode(22);

        System.out.println(sumNumbers(root));
    }
}
