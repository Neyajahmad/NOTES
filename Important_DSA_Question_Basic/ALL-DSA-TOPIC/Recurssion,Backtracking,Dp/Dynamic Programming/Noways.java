public class Noways {
static int calls=0;
    private static int no_of_ways(String number , int idx, int dp[]){

        calls++;
        if(idx<=0){
            return 1;
        }

        if(dp[idx]!=-1){
            return dp[idx];

        }
        int not_combine=0;
        if(number.charAt(idx)!='0'){
            not_combine=no_of_ways(number, idx-1,dp);
        }

        int combine=0;
         if(number.charAt(idx-1)=='1' || (number.charAt(idx-1)=='2' && number.charAt(idx)<='6')){
            combine=no_of_ways(number, idx-2,dp);
        }

        return dp[idx]=not_combine+combine;
    }
    public static void main(String[] args) {
        String number="11126";
        int n=number.length();
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(no_of_ways(number,n-1,dp));
        System.out.println(calls);
    }
    
}
