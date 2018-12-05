package Trees;
import java.util.*;

public class targetTwoSum {

    TreeNode mainRoot = null;

    int[] twoSum(TreeNode root, int z){

        if(root == null)
            return null;

        int[] res = new int[2];
        Arrays.fill(res,-1);
        mainRoot = root;
        return inorder(root,res,z);
    }

    int[] inorder(TreeNode root, int[] res, int z){

       if(root!=null && res[0] ==-1){
           inorder(root.left,res,z);
           if(binarySearch(mainRoot, z-root.val)!=null){
               res[0] = root.val;
               res[1] = z-root.val;
           }
           inorder(root.right,res,z);
       }

        return res;
    }

    TreeNode binarySearch(TreeNode root, int target){

        if(root == null)
            return null;
        if(target == root.val)
            return root;

        else if(target>root.val)
           return binarySearch(root.right,target);
        else{
            return binarySearch(root.left,target);
        }
    }


    public int[] twoSumBFS(TreeNode root, int target){

        Queue<TreeNode> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        Arrays.fill(res, Integer.MIN_VALUE);
        q.add(root);

        while(!q.isEmpty()){

            TreeNode n = q.remove();
            if(set.contains(target-n.val)){
                res[0] = n.val;
                res[1] = target-n.val;
                return res;
            }

            else{
                set.add(n.val);
            }

            if(n.left!=null)
                q.add(n.left);

            if(n.right!=null)
                q.add(n.right);
        }

        return res;
    }




   public static void main(String argsp[]){

       TreeNode root = new TreeNode(9);
       TreeNode rl = root.left = new TreeNode(4);
       TreeNode rr = root.right = new TreeNode(17);
       rl.right = new TreeNode(6);
       rl.left = new TreeNode(3);
       rr.right = new TreeNode(22);

       targetTwoSum obj = new targetTwoSum();
      // System.out.println(obj.binarySearch(root, 4).val);
      // System.out.println(obj.binarySearch(root, 10));
       //int res[] = obj.twoSum(root, 11);
       int res[] = obj.twoSumBFS(root, 10);
       System.out.println(res[0] + " " + res[1]);

   }



}
