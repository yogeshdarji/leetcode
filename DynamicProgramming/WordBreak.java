package DynamicProgramming;
import java.util.*;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict){
        boolean[] f = new boolean[s.length()+1];
        f[0] = true;

        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(f[j] && wordDict.contains(s.substring(j,i))){
                    f[i] = true;
                    break;
                }

            }
        }

        return f[s.length()];

    }

    public static void main(String args[]){
        List<String> al  = new ArrayList<>();
        al.add("leet");
        al.add("code");
        System.out.println(wordBreak("leetcode", al));
    }
}
