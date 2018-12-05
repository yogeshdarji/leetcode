package Trees;
import java.util.*;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root){

        if(root == null)
            return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<List<Integer>> result = new LinkedList<>();
        int c;
        int push = 1;
        while(!q.isEmpty()){

            List<Integer> subList = new LinkedList<>();
            c = push;
            push = 0;
            while(c>0) {
                TreeNode n = q.remove();
                subList.add(n.val);
                c--;

                if (n.left != null) {
                    q.add(n.left);
                    push++;
                }

                if (n.right != null) {
                    q.add(n.right);
                    push++;
                }

            }

            result.add(subList);

        }

        return result;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        TreeNode rl = root.left = new TreeNode(9);
        TreeNode rr = root.right = new TreeNode(0);
        rl.left = new TreeNode(1);
        rl.right = new TreeNode(5);
        rr.left = new TreeNode(12);

        List<List<Integer>> ans = levelOrder(root);

        System.out.println(ans);

    }

}
