import java.util.*;
public class subsequence {

    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char first=s.charAt(0);
        //recurssive
        ArrayList<String> small=getSSQ(s.substring(1));

        //add  self work
        for(String ss:small){
             ans.add(ss);
             ans.add(first+ss);
        }
        return ans;

    }
    public static void main(String[] args) {
        ArrayList<String> abc=getSSQ("abc");
        for(String ss:abc){
            System.out.println(ss);
        }
    }
    
}
