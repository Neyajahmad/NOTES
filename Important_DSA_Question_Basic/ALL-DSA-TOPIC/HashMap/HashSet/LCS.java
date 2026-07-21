// Longest consecutive Sequence
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

import java.util.*;
public class LCS {

    public static int longestConsecutive(int num[]){
        HashSet<Integer> st=new HashSet<>();
        for(var a:num){
            st.add(a);
        }
        int maxStreak=0;
        for(int n:st){
            if(!st.contains(n-1)){ //num is starting point of a sequence
                int currNum=n;
                int currStreak=1;
                while(st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
       int num[]={1,100,200,2,45,3,1,4,9,5,6};
       int ans=longestConsecutive(num);
       System.out.println("longest consecutive subsequence is "+ans);
    }
    
}
