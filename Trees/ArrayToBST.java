package Trees;

public class ArrayToBST {

    public static TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        return helper(nums,l,r);
    }

    private static TreeNode helper(int nums[], int left, int right){
        if(left>right)
            return null;

        int mid = ((left + right)+1)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left, mid-1);
        root.right = helper(nums,mid+1, right);

        return root;
    }

    public static void main(String args[]){

        int nums[] = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.left.left.val);
        if(root.left.right!=null)System.out.println(root.left.right.val);
        if(root.right.left!=null)System.out.println(root.right.left.val);
        if(root.right.right!=null)System.out.println(root.right.right.val);
    }

}
