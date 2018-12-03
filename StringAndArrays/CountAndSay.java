package StringAndArrays;

public class CountAndSay {

    public static String countAndSay(int n) {

        String memo[] = new String[n+1];
        memo[1] = "1";
        return countAndSay(n, memo);

    }

    private static String countAndSay(int n, String memo[]){
        if(n==1)
            return memo[n];

        if(memo[n]!=null)
            return memo[n];

        String result = countAndSay(n-1, memo);
        memo[n] = compress(result);
        return memo[n];
    }

    private static String compress(String result){
        int index = 0;
        int indexAns = 0;
        char[] chars = result.toCharArray();
        String res = "";
       StringBuilder sb = new StringBuilder(res);

        while(index<chars.length){
            int count = 0;
            char currentCharacter = chars[index];
            while(index < chars.length && currentCharacter == chars[index]){
                count++;
                index++;
            }

          sb.append(Integer.toString(count));
            sb.append(currentCharacter);

        }

        return sb.toString();

    }

    public static void main(String args[]){
        System.out.println(countAndSay(5));
    }

}
