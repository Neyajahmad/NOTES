import java.util.List;

public class CoinchangeMemo {
    private static int rec(List<Integer> coins, int sum, int idx,int dp[][]){

        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }
        if(idx==0){
            if(sum%coins.get(idx)==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        int pick=0;
        if(sum>=coins.get(idx)){
            pick=rec(coins, sum-coins.get(idx), idx,dp);
        }
        int notpick=rec(coins, sum, idx-1,dp);

        return dp[idx][sum]=pick+notpick;

    }
    public static void main(String[] args) {
        List<Integer> coins =List.of(1,2,3);

        int sum=4;
        int n=coins.size();

        int dp[][]=new int[n+1][sum+1];

        for(int i=0;i<=n;i++){
             for(int j=0;j<=sum;j++){
                dp[i][j]=-1;
             }

        }

         System.out.println(rec(coins, sum, n-1,dp));
    }
}
