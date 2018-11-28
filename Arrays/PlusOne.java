package Arrays;
import java.util.*;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        int j = n-1;
        int countZeros = 0;
        int res[];

        if(digits[n-1]>=0 && digits[n-1]<=8){
            digits[n-1]++;
            return digits;
        }

        else{
            while(j>-1){
                if(digits[j]!=9)
                    break;
                j--;
                countZeros++;
            }

            if(countZeros == n){
                res = new int[n+1];
                res[0] = 1;
                for(int i=1; i<res.length; i++){
                    res[i] = 0;
                }
            }

            else{
                res = new int[n];
                for(int i=0; i<countZeros; i++){
                    res[n-1-i] = 0;
                }

                res[n-countZeros-1] = digits[n-countZeros-1] + 1 ;

                for(int i=0; i<(n-countZeros-1); i++){
                    res[i] = digits[i];
                }
            }

        }

        return res;
    }

    public static void main(String args[]){
        //int a[] = {1,2,3,9};
        //int a[] = {9,9,9,9};
        //int a[] = {9,8,7,6,5,4,3,2,1,0};
        int a[] = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int res[] = plusOne(a);
        for(int i=0; i<res.length; i++)
            System.out.print(res[i]);
    }
}
