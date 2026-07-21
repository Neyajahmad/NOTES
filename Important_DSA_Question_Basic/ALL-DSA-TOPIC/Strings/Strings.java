import java.util.Scanner;

public class Strings{
    public static void main(String args[]){
        String name="Ahmad";
        String surname="Ahmad";
        String n=new String("Ahmad");
        Scanner sc=new Scanner(System.in);
        // String str1=sc.next(); // print single word
        // String str2=sc.nextLine(); // print line
        // System.out.println(str2); // 
        // System.out.println(name.indexOf("a"));
        // System.out.println(name.charAt(3));
        // System.out.println(name.length());
        // System.out.println(name.compareTo(surname));  // name==surname -->zero, name>surname-->positive, name<surname-->negative.
        // System.out.println(name.contains("hah"));
        // System.out.println(name.startsWith("Ney"));
        // System.out.println(name.endsWith("ad"));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.concat(surname));
        // System.out.println(name.substring(0,2)); //[0,2)
        // System.out.println(name.substring(2)); //[2,end)
        System.out.println(name.equals(n));
        // System.out.println(name==n); //check address.

    }
}