package Trees;

public class checkBalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {

        if(root == null)
            return true;

        if(Math.abs(height(root.left) - height(root.right))>1)
            return false;

        return true;

    }

    private static int height(TreeNode root){
        if(root == null)
            return 0;

        return Math.max(height(root.left),height(root.right)) + 1;

    }


    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        TreeNode rl = root.left = new TreeNode(9);
        TreeNode rr = root.right = new TreeNode(20);
       // rl.left = new TreeNode(1);
        //rl.right = new TreeNode(5);
        rr.left = new TreeNode(15);
        rr.right  = new TreeNode(7);



        System.out.println(isBalanced(root));

    }
}
