package Arrays;
import java.util.*;

public class majorityElements {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int half = nums.length/2;
        int c = 1;
        int val = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i] && c<=half){
                c++;
                val = nums[i-1];
            }

            else if(c>half)
                break;
            else{
                c = 1;
            }

        }

        return val;
    }

    public static void main(String args[]){
       // int[] a = {3,2,3};
       // int[] a = {2,2,1,1,1,2,2};
        int [] a = {1};
        System.out.println(majorityElement(a));
    }
}
