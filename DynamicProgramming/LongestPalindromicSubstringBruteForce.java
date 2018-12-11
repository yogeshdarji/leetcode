package DynamicProgramming;

import java.util.HashMap;

public class LongestPalindromicSubstringBruteForce {

    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }


    public static String longestPalindrome(String s){

       // HashMap<String, Integer> m = new HashMap<>();
        if(s.length() == 1 || s.equals(""))
            return s;

        int max = Integer.MIN_VALUE;
        String res="";

        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<=s.length(); j++){
                String p = s.substring(i,j);
                if(isPalindrome(p)){
                    if(p.length()>max){
                        max = p.length();
                        res = p;
                    }
                }
            }
        }

       return res;
    }

    public static void main(String args[]){
        System.out.println(isPalindrome("baba"));
        //System.out.println(longestPalindrome("baba"));
        System.out.println(longestPalindrome("yxabaxy"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
    }

}
