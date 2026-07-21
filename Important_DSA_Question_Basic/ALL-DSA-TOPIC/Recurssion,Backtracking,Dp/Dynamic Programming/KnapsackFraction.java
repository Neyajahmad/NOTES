import java.util.List;

public class KnapsackFraction {

    private static int rec(int idx,int W, List<Integer> profit, List<Integer> weights){
        if(idx==0){
            if (weights.get(0)<=W) {
                return profit.get(0);
            }
            else{
                return 0;
            }
        }

        int pick=0;
        if(W>=weights.get(idx)){
            pick=profit.get(idx)+rec(idx-1, W-weights.get(idx), profit, weights);
        }
        int notpick=rec(idx-1, W, profit, weights);

        return Math.max(pick, notpick);
    }
    public static void main(String[] args) {
        List<Integer> profit=List.of(1,2,3);
        List<Integer> weights=List.of(4,5,1);

        int W=4;
        int n=profit.size();
        System.out.println(rec(n-1,W,profit,weights));
    }
    
}
