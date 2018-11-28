package Arrays;

public class MaximumSubArrayDAC {

    public static int maxSubArray(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        return maxSubArrayHelper(nums, low, high);

    }

    public static int findMaximumCrossingSubArray(int nums[], int low, int mid, int high){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxLeft = 0;

        for(int i=mid; i>=low; i--){
            sum = sum + nums[i];
            if(sum>leftSum){
                leftSum = sum;
                maxLeft = i;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = 0;

        for(int i=mid+1; i<=high; i++){
            sum = sum + nums[i];
            if(sum>rightSum){
                rightSum = sum;
                maxRight = i;
            }
        }

        return leftSum+rightSum;
    }

    private static int maxSubArrayHelper(int nums[], int low, int high){

        int mid  = (low+high)/2;

        if(low == high)
            return nums[low];

        else{
            int leftSum = maxSubArrayHelper(nums, low, mid);
            int rightSum = maxSubArrayHelper(nums, mid+1, high);
            int crossSum = findMaximumCrossingSubArray(nums, low, mid, high);

            if(leftSum >= rightSum && leftSum>=crossSum)
                return leftSum;

            else if(rightSum >= leftSum && rightSum >= crossSum)
                return rightSum;

            else{
                return crossSum;
            }
        }
    }


    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

}
