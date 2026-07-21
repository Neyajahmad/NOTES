public class Dpfibbo {
 static int call=0;
    private static int Dpfibbo(int n, int dp[]){
        if(n==1 || n==0){
            return 1;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        call++;

        // int result=Dpfibbo(n-1, dp) + Dpfibbo(n-2, dp);
        // return result;

        // dp[n]=Dpfibbo(n-1, dp) + Dpfibbo(n-2, dp);
        // return dp[n];

        return dp[n]=Dpfibbo(n-1, dp) + Dpfibbo(n-2, dp);
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(Dpfibbo(n,dp));
        System.out.println(call);
    }
    
}


//Time complexity :-- O(n)
//space complexity :-- O(n)