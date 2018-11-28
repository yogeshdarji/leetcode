package Arrays;

public class MedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;

       int start = 0;

       int end = x<=y?x:y;

       if(x<=y)
        return findMedianHelper(nums1, nums2, start, end, x, y);
       else
           return findMedianHelper(nums2, nums1, start, end, y, x);

    }

    private static double findMedianHelper(int nums1[], int nums2[], int start, int end, int x, int y){

        int xPartition = (start + end)/2;
        int yPartition = (x+y+1)/2 - xPartition;

        int maxLeftX = (xPartition == 0)? Integer.MIN_VALUE : nums1[xPartition-1];
        int minRightX = (xPartition == x)? Integer.MAX_VALUE : nums1[xPartition];

        int maxLeftY  = (yPartition == 0)? Integer.MIN_VALUE : nums2[yPartition-1];
        int minRightY = (yPartition == y)? Integer.MAX_VALUE : nums2[yPartition];



         if(maxLeftX<=minRightY && maxLeftY<=minRightX){
            if((x+y)%2!=0)
                return Math.max(maxLeftX, maxLeftY);
            else
                return (Math.max(maxLeftX, maxLeftY)+ Math.min(minRightX, minRightY))/2.0;
        }

        else if(maxLeftX>minRightY){
            return findMedianHelper(nums1, nums2, start, xPartition-1, x, y);
        }

        else{
            return findMedianHelper(nums1, nums2, xPartition+1, end, x, y);
        }

    }


    public static void main(String args[]){
//        int nums1[] = {1,5};
//        int nums2[] = {3,4,6,7};

//        int nums1[] = {23,26,31,35};
//        int nums2[] = {3,5,7,9,11,16};

//        int nums1[] = {1,3,8,9,15};
//        int nums2[] = {7,11,18,19,21,25};

//        int nums1[] = {1,3,8,9,15};
//        int nums2[] = {16,20,22,26,28};


        int nums1[] = {1,3};
        int nums2[] = {2};


        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

}
