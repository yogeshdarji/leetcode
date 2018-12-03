package StringAndArrays;

public class Anagram {

    public static boolean checkStr(String s1, String s2){

       if(s1.length()!=s2.length())
           return false;

        int[] temp = new int[26];

        for(int i=0; i<s1.length(); i++){
            temp[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<s2.length();i++){
            temp[s2.charAt(i)-'a']--;
        }

        for(int i:temp){
            if(i>0)
                return false;
        }

        return true;
    }

    public static void main(String[] args){

        System.out.println(checkStr("mango", "namog"));
    }

}
