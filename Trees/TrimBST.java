package Trees;
import java.util.*;

public class TrimBST {

    //static int arr[] = new int[10];
    static List<Integer> list = new ArrayList<>();
    static int i = 0;
    public static TreeNode trimBST(TreeNode root, int L, int R) {

        inorder(root,L,R);
        int arr[] = toIntArray(list);
        return buildBST(arr);
    }


   static int[] toIntArray(List<Integer> list)  {
        int[] ret = new int[list.size()];
        int i = 0;
        for (Integer e : list)
            ret[i++] = e;
        return ret;
    }

    private static void inorder(TreeNode root, int L, int R){
        if(root == null)
            return;

        inorder(root.left,L,R);
        if(root.val >= L && root.val <=R)
        {
            System.out.println(root.val);
           // arr[i++] = root.val;
            list.add(root.val);
        }
        inorder(root.right,L,R);

    }

    private static TreeNode buildBST(int nums[]){
        return helper(nums,0,nums.length-1);
    }

    private static TreeNode helper(int nums[], int l, int r){

        if(l>r)
            return null;

        int mid = ((l+r)+1)/2;
        TreeNode newNode = new TreeNode(nums[mid]);
        newNode.left = helper(nums,l, mid-1);
        newNode.right = helper(nums,mid+1,r);

        return newNode;

    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(4);
        TreeNode rl = root.left = new TreeNode(2);
        TreeNode rr = root.right = new TreeNode(5);
        rl.left = new TreeNode(1);
        rl.right = new TreeNode(3);
       // rr.left = new TreeNode(12);

        TreeNode res = trimBST(root,2,4);

        System.out.println(res.val);
        System.out.println(res.left.val);
        System.out.println(res.right.val);

    }

}
