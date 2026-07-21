import java.util.List;

public class CoinchangeTabula{
    public static void main(String[] args) {
        List<Integer> coins =List.of(1,2,3);
        int n=coins.size();
        int totalsum=4;

        int dp[][]=new int[n+1][totalsum+1];

        // Tabular...
        // for(int i=0;i<=totalsum;i++){
        //      if (i%coins.get(0)==0) {
        //         dp[0][i]=1;
        //      }
        //      else{
        //         dp[0][i]=0;
        //      }
        // }

        // for(int idx=1;idx<n;idx++){
        //     for(int sum=0;sum<=totalsum;sum++){
        //        int pick=0;
        //        if(sum>=coins.get(idx)){
        //        pick=dp[idx][sum-coins.get(idx)];
        //        }
        //        int notpick=dp[idx-1][sum]; 
        //        dp[idx][sum]=pick+notpick; 
        //     }
        // }
        // System.out.println(dp[n-1][totalsum]);
    


        // optimize space


        int [] cur=new int[totalsum+1];
        int [] prev=new int[totalsum+1];

        for(int i=0;i<=totalsum;i++){
            cur[i]=0;
             if (i%coins.get(0)==0) {
                prev[i]=1;
             }
             else{
                prev[i]=0;
             }
        }

         for(int idx=1;idx<n;idx++){
            for(int sum=0;sum<=totalsum;sum++){
               int pick=0;
               if(sum>=coins.get(idx)){
               pick=cur[sum-coins.get(idx)];
               }
               int notpick=prev[sum]; 
               cur[sum]=pick+notpick; 
            }
            prev=cur;
        }

            System.out.println(prev[totalsum]);
    }
}


//Tc :--O(N*sum)
//sc :-- o(sum)