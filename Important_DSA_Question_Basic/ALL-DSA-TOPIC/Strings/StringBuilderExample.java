// use string builder to improve poor performance.
// string is immutable

import java.util.*;
public class StringBuilderExample {
    public static void main(String[] args) {
        
        StringBuilder str1=new StringBuilder("hello");
        // str.append("world");
        // str.setCharAt(0, 'N');
        // str.insert(0, 'N');
        // str.deleteCharAt(1);
        // str.reverse();
        // str.delete(0, 1); // [0,1)
        // System.out.println(str);

        // take input in String builder...

        Scanner sc=new Scanner(System.in);
        StringBuilder str2=new StringBuilder(sc.nextLine());
    }
    
}
