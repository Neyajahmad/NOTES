public class MaxSurvive {
    public static void main(String[] args) {
        int S=10; // no of days 
        int N=16; // Max quantity buy
        int M=2; // has din consume (sunday ko khana nhi milai ga).

        int total_food_required=S*M;
        int result;
        // 1 hafta consumption>1 hafta buy

        if((M>N) || (7*M)>(6*N)){
            result =-1;
        }
        else{
            result=(int) Math.ceil((double) total_food_required/N);
        }
        System.out.println(result);
    }
    
}
