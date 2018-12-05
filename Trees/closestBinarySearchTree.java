package Trees;

public class closestBinarySearchTree {

    public static int closestValue(TreeNode root, double target){

        if(root == null)
            return Integer.MAX_VALUE;

        TreeNode curr = root;
        double diff = Math.abs(target-root.val);
        TreeNode source = root;

        while(curr!=null){
            if(target == curr.val)
                return curr.val;

            else if(target<curr.val){
                curr = curr.left;
            }

            else {
                curr = curr.right;
            }

            if(curr!=null && Math.abs(target-curr.val)<diff) {
                diff = Math.abs(target - curr.val);
                source = curr;
            }

        }

        return source.val;

    }

    public static int closestRecursion(TreeNode root, double target){
        return 0;
    }


    public static void main(String args[]){
        TreeNode root = new TreeNode(9);
        TreeNode rl = root.left = new TreeNode(4);
        TreeNode rr = root.right = new TreeNode(17);
        rl.right = new TreeNode(6);
        rl.left = new TreeNode(3);
        rr.right = new TreeNode(22);

        System.out.println(closestValue(root,6.1));


    }


}
