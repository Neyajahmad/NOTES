public class Robproblem {
    private static int rob(int[] houses, int ind){

        // overlapping sub problem
        // optimal sub structure

        // 9 1 3 8..


        //base condition
        if(ind==houses.length-1){
            return houses[ind];
        }
        if(ind>=houses.length){
            return 0;
        }

        // reccusion
        int pick=houses[ind]+rob(houses, ind+2);
        int not_pick=rob(houses, ind+1);

        // output..(return statement)
        return Math.max(pick, not_pick);

    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=9;
        arr[1]=1;
        arr[2]=3;
        arr[3]=8;

        System.out.println(rob(arr, 0));
    }
    
}
