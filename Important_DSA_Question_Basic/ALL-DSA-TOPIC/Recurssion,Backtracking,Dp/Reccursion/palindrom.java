
public class palindrom {
   public static boolean check(String s, int start,int end){
        if(start>=end){
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s,start+1,end-1);
    }
    public static void main(String[] args) {
        String s="abcba";
        int start=0;
        int end=s.length()-1;
       System.out.println(check(s,start,end));       
    } 
}
