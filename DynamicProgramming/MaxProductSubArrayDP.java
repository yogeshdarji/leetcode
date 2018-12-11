package DynamicProgramming;

public class MaxProductSubArrayDP {

    public static int maxProduct(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(maxEndingHere * nums[i] < 0){
                maxEndingHere = maxEndingHere * nums[i];
            }
            else{
                maxEndingHere = Math.max(maxEndingHere * nums[i], nums[i]);
            }

            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }

    public static void main(String args[]) {
        //int arr[] = {-2, 3, 1, -4};
        //int arr[] = {2,3,-2,4};
        int arr[] = {-2,0,-1};
        System.out.println(maxProduct(arr));
    }

}
