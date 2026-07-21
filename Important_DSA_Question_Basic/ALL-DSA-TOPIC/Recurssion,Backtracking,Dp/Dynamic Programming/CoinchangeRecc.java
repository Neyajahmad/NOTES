import java.util.*;
public class CoinchangeRecc {
    private static int rec(List<Integer> coins, int sum, int idx){

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
            pick=rec(coins, sum-coins.get(idx), idx);
        }
        int notpick=rec(coins, sum, idx-1);

        return pick+notpick;

    }
    public static void main(String[] args) {
        List<Integer> coins =List.of(1,2,3);

        int sum=4;
        int n=coins.size();

        System.out.println(rec(coins,sum,n-1));
    }
    
}
