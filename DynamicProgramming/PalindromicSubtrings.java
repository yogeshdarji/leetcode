package DynamicProgramming;

public class PalindromicSubtrings {

    public static int countSubStrings(String s){
        int n = s.length();
        String res = null;
        int count = 0;

        boolean[][] dp = new boolean[n][n];

        for(int i=n-1; i>=0; i--){
            for(int j=i; j<n; j++){
                if(s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    count++;
                }
//
//                if(dp[i][j]&& (res == null || j-i+1>res.length()))
//                    res = s.substring(i,j+1);
            }
        }

        return count;

    }

    public static void main(String args[]){
       // int res = countSubStrings("abaxabaxabb");
        int res = countSubStrings("aaa");
        System.out.println(res);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toBinaryString(-16));
    }
}
