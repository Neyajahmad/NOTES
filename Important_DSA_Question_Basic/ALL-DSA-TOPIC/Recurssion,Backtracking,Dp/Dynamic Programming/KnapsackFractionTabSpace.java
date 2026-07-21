import java.util.List;

public class KnapsackFractionTabSpace {
    public static void main(String[] args) {
        List<Integer> profit=List.of(1,2,3);
        List<Integer> weights=List.of(4,5,1);

        int Wt=4;
        int n=profit.size();
 
        int[] prev=new int[Wt+1];
        int[] cur=new int[Wt+1];
        
        for(int i=0;i<=Wt;i++){
            cur[i]=0;
            if(weights.get(0)<=i){
                prev[i]=profit.get(0);
            }
            else{
                prev[i]=0;
            }
        }

        for(int idx=1;idx<n;idx++){
            for(int W=0;W<=Wt;W++){
                 int pick=0;
        if(W>=weights.get(idx)){
            pick=profit.get(idx)+prev[W-weights.get(idx)];
        }
        int notpick=prev[W];

        cur[W]=Math.max(pick, notpick);
            }
            System.arraycopy(cur, 0, prev,0, Wt+1);
        }


        System.out.println(prev[Wt]); 
    }
    
}
