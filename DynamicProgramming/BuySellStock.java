package DynamicProgramming;

public class BuySellStock {
    public int maxProfit(int[] A) {
        int minPrice = Integer.MAX_VALUE;
        int maxSoFar = 0;

        for(int i=0; i<A.length; i++){
            minPrice = Math.min(minPrice, A[i]);
            maxSoFar = Math.max(maxSoFar, A[i]-minPrice);
        }

        return maxSoFar;
    }

}
