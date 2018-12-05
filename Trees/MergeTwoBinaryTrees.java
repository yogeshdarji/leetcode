package Trees;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return null;
        else if(t1!=null && t2==null)
            return t1;
        else if(t1==null && t2!=null)
            return t2;

            TreeNode res = new TreeNode(t1.val+t2.val);
            res.left = mergeTrees(t1.left,t2.left);
            res.right = mergeTrees(t1.right, t2.right);

        return res;
    }

    public static void main(String args[]){


    }
}
