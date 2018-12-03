package StringAndArrays;

import java.util.*;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseString {

    public static void main(String args[]){
        String input = "Hello World!";
        char[] c = input.toCharArray();
        List<Character> al = new ArrayList<>();

        for(char i:c){
            al.add(i);
        }

        Collections.reverse(al);
        ListIterator<Character> li =  al.listIterator();

        while(li.hasNext()){
            System.out.print(li.next());
        }

        System.out.println();
        char[] a = {'a'};
        System.out.println(a);


    }
}
