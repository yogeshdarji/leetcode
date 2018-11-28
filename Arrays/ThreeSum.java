package Arrays;
import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if(i == 0 || (i>0) && nums[i]!=nums[i-1]){
                int lo = i+1, hi = nums.length-1, sum = 0-nums[i];
                while(lo<hi){
                    if(nums[lo]+nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                        while(lo<hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }

                    else if(nums[lo]+nums[hi]<sum)
                        lo++;
                    else
                        hi--;
                }
            }
        }

        return res;
    }

    public static void main(String args[]){
        int[] A = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(A);
        for(List<Integer> x:res){
            System.out.println(x);
        }
    }
}
