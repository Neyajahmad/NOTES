import java.util.*;
public class RemoveOccurence {

    public static String remove2(String s){
        if(s.length()==0){
            return "";
        }

        String smallAns=remove2(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar!='a'){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }


    public static String remove(String s, int indx){
          if(s.length()==indx){
            return "" ;
          }
          String smallAns=remove(s, indx+1);

          char currChar=s.charAt(indx);

          if(currChar!='a' && currChar!='A'){
              return currChar+smallAns;  // if 1st latter is not A.. then add.
          }
          else{
            return smallAns; // if 1st letter is A then only add indx+1.
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       System.out.println(remove(s, 0)); 
       System.out.println(remove2(s)); 
    }
}
