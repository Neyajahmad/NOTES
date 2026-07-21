import java.util.List;

public class KnapsackFractionTabu {
    public static void main(String[] args) {
        List<Integer> profit=List.of(1,2,3);
        List<Integer> weights=List.of(4,5,1);

        int Wt=4;
        int n=profit.size();
        int [][] dp=new int [n+1][Wt+1];
        
        for(int i=0;i<=Wt;i++){
            if(weights.get(0)<=i){
                dp[0][i]=profit.get(0);
            }
            else{
                dp[0][i]=0;
            }
        }

        for(int idx=1;idx<n;idx++){
            for(int W=0;W<=Wt;W++){
                 int pick=0;
        if(W>=weights.get(idx)){
            pick=profit.get(idx)+dp[idx-1][W-weights.get(idx)];
        }
        int notpick=dp[idx-1][W];

        dp[idx][W]=Math.max(pick, notpick);
            }
        }


        System.out.println(dp[n-1][Wt]);
    }
    
}
