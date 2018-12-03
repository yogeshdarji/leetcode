package StringAndArrays;

/*
Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.*/

public class compressStringInplace {
    //aaab => "a","3"
    public static int compress(char[] chars) {

      int index = 0;
      int indexAns = 0;

      while(index<chars.length) {

          int count = 0;

          char currentCharacter = chars[index];
          while (index<chars.length && chars[index] == currentCharacter) {
              index++;
              count++;
          }

          chars[indexAns++] = currentCharacter;

          if (count != 1) {
              for (char c : Integer.toString(count).toCharArray()) {
                  chars[indexAns++] = c;
              }
          }

      }

      for(int i=0; i<indexAns; i++){
          System.out.print(chars[i]);
      }
        System.out.println();

      return indexAns;

    }

    public static void main(String args[]){
        char[] ch = {'a','a','a','b'};
        System.out.println(compress(ch));
    }

}
