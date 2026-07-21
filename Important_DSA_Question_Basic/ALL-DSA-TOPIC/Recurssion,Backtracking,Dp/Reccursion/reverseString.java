import java.util.*;
public class reverseString {

    public static String reveseS(String s, int indx){
        if(s.length()==indx){
            return "";
        }

        String small=reveseS(s, indx+1);
        return small+s.charAt(indx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reveseS(s, 0));
    }
    
}
