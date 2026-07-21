import java.util.ArrayList;
import java.util.List;

public class printpermutation {
    public static void printp(String s, String t, List<String> st){
        if(s.equals("")){
            // System.out.println(t);
            st.add(t);
            return;
        }
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i); // b --> assume
            String left=s.substring(0,i); // a
            String right=s.substring(i+1); // c
            String rem=left+right;
            printp(rem,t+l,st);

        }
    }
    public static void main(String[] args) {
        String s="abc";
        List<String> st=new ArrayList<>();  // store in a arraylist
        printp(s,"",st);
        for(int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
    }
    
}
