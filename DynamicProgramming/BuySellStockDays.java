package DynamicProgramming;
import java.util.*;

//{100, 180, 260, 310, 40, 535, 695}
//  0   1    2    3    4     5   6

public class BuySellStockDays {

    public List<List<Integer>> maxProfit(int[] A){
        List<List<Integer>> res = new ArrayList<>();

        if(A == null)
            return res;

       int i = 0;
       int valley = A[0];
       int peak = A[0];
       int minIndex = -1;
       int maxIndex = -1;

       while(i<A.length-1){

           List<Integer> subList = new ArrayList<>();
           while(i<A.length-1 && A[i]>=A[i+1])
               i++;
           valley = A[i];
           minIndex = i;
           subList.add(minIndex);

           while(i<A.length-1 && A[i]<=A[i+1])
               i++;
           peak = A[i];
           maxIndex = i;
           subList.add(maxIndex);

           if(minIndex!=maxIndex)
           res.add(subList);
           i++;
       }

        return res;
    }

    public static void main(String args[]){

        BuySellStockDays buySellObj = new BuySellStockDays();
        int[] A = {100, 180, 260, 310, 210, 535, 695, 30, 25};
        //int[] A ={};
        List<List<Integer>> res = buySellObj.maxProfit(A);
        System.out.println(res);

    }

}
