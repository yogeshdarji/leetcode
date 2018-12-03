package StringAndArrays;
import java.util.*;

public class compressString {

    public static String compress(String s){

        char last = s.charAt(0);
        int count = 1;
        String res = "";

        for(int i=1; i<s.length();i++){
            if(last==s.charAt(i)){
                last = s.charAt(i);
                count++;
            }

            else{
                res = res + last + count;
                last = s.charAt(i);
                count = 1;
            }
        }

        if(res.length()<=s.length())
            return res;

        else
            return s;
    }

    public static void main(String args[]){
        System.out.println(compress("abcde"));
    }

}
