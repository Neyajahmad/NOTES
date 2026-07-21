public class TabulationFibo{
    static int calls;
    public static int fibo(int n,int [] dp){
        // memo..
        calls++;

        if(dp[n]!=-1){
            return dp[n];
        }

        if(n==1 || n==2){ 
            return 1;
        }

        return dp[n]=fibo(n-1, dp) +fibo(n-2, dp);
    }

    //  1 1 2 3 5 8 13 21 34 55...
    public static void main(String[] args) {
        // tabulation 
        int n=5;
         // int dp[]=new int[n+1];
        // for(int i=0;i<n+1;i++){
        //     dp[i]=-1;
        // }

        // dp[1]=1;
        // dp[2]=1;


        int prev1=1;
        int prev2=1;
        int curr=0;

        for(int i=3;i<=n;i++){
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
            // dp[i]=dp[i-1]+dp[i-2];
        }

        System.out.println(curr);

        // System.out.println(dp[n]);

        // System.out.println(fibo(n, dp));
        // System.out.println("No. of calls: "+calls);
    }
}
