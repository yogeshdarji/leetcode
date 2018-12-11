package DynamicProgramming;

public class HouseRobber {
    public static int rob(int[] nums) {

        int ec = 0;
        int oc = 0;
        int k = 0;
        for(int i=0; i<nums.length; i++){

            if(i%2==0)
                ec+=nums[i];
            else
                oc+=nums[i];
        }

        return Math.max(ec,oc);
    }

    public static void main(String args[]){
        // int[] a = {3,2,3};
        int[] a = {2,1,1,2};
        System.out.println(rob(a));
    }
}
