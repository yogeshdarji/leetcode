package Arrays;

public class MaximumSubArrayDP {

    public static int maxSubArray(int A[]){
        int maxEndingHere = A[0];
        int maxSoFar = A[0];

        for(int i=1; i<A.length; i++){
            maxEndingHere = Math.max(maxEndingHere+A[i], A[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }

        return maxSoFar;
    }

    public static int maxSubArrayBruteForce(int A[]){

        int maxSoFar = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            int sum = A[i];
            maxSoFar = Math.max(maxSoFar, sum);

            for(int j = i+1; j<A.length; j++){
                sum = sum + A[j];
                maxSoFar = Math.max(maxSoFar, sum);
            }
        }

        return maxSoFar;

    }

    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

        //int arr[] = {-2,1};


//        int arr[] = {-1,0,-2};

      //  int arr[] = {1,-3,2,1,-1};

       // System.out.println(maxSubArrayBruteForce(arr));
    }

}
