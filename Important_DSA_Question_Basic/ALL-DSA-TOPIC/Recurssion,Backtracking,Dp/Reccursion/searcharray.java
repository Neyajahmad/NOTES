

public class searcharray {

    // print all the index where element present of target element.
    public static void allindex(int arr[], int n,int target,int indx){
        if(indx>=n){
             return;
        }
        if(arr[indx]==target){
            System.out.println(indx);
        }
        allindex(arr, n, target, indx+1);
    }


    // search target element present or not in the array.
    public static boolean find(int arr[],int n,int target,int indx){

        // base case
        if(indx>=n){
            return false;
        }

        // self work
        if(arr[indx]==target){
            return true;
        }

        // recurssive work
        return find(arr, n, target, indx+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,2,2};
        int target=2;
        int n=arr.length;

        allindex(arr, n, target, 0);
        // if(find(arr, n, target, 0)){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        
    }
    
}
