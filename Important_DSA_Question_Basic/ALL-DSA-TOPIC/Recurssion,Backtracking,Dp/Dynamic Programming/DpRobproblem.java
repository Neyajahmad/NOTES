public class DpRobproblem {

    static int calls=0;
     private static int rob(int[] houses, int ind,int dp[]){
        // overlapping sub problem
        // optimal sub structure

        // 9 1 3 8..
        calls++;
        //base condition
        if(ind==houses.length-1){
            return houses[ind];
        }
        if(ind>=houses.length){
            return 0;
        }

        if(dp[ind]!=-1){
            return dp[ind];
        }

        // reccusion
        int pick=houses[ind]+rob(houses, ind+2, dp);
        int not_pick=rob(houses, ind+1, dp);

        // output..(return statement)
        return dp[ind]=Math.max(pick, not_pick);

    }
    public static void main(String[] args) {
        int n=4;
        int arr[]=new int[n];
        arr[0]=9;
        arr[1]=1;
        arr[2]=3;
        arr[3]=8;

        int dp[]=new int[n];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }


        System.out.println(rob(arr, 0, dp));
        System.out.println(calls);
    }
}
