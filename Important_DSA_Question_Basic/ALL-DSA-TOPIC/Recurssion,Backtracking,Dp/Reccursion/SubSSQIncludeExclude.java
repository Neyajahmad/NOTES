
public class SubSSQIncludeExclude {
    public static void SSQ(String s,String currAns){  // "abc"  , currAns = " ";
    if(s.length()==0){
        System.out.println(currAns);
        return;
    } 
    char curr=s.charAt(0); // a 
        String remString=s.substring(1);  // bc

        //curr char --> chooses to be a part of currAns.
        SSQ(remString, currAns+curr); // bc , a  :--> a+b.. (include).

        //curr char --> does not choose to be a part of currAns
        SSQ(remString, currAns); // bc," ". (not include).

    }
    public static void main(String[] args) {
        SSQ("abc", "");
    }
}
