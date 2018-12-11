package DynamicProgramming;

/*https://leetcode.com/problems/longest-palindromic-substring/discuss/2921/Share-my-Java-solution-using-dynamic-programming*/
public class LongestPalindromeSubStringDP {
    public static String longestPalindrome(String s){
        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for(int i=n-1; i>=0; i--){
            for(int j=i; j<n; j++){
               if(s.charAt(i) == s.charAt(j) && (j-i<3 || dp[i+1][j-1]))
                   dp[i][j] = true;

               if(dp[i][j]&& (res == null || j-i+1>res.length()))
                   res = s.substring(i,j+1);
            }
        }

        return res;

    }

    public static void main(String args[]){
        String res = longestPalindrome("abaxabaxabb");
        System.out.println(res);
        System.out.println(res.length());
    }
}
