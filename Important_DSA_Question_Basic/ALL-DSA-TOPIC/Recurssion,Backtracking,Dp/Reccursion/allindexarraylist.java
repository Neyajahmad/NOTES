import java.util.*;


// find all the index and store or return a arraylist.
public class allindexarraylist {

    public static ArrayList<Integer> allindx(int arr[],int target,int n,int indx){
        ArrayList<Integer> ans=new ArrayList<>();
                if(indx>=n){
                    return ans; // return empty arraylist.
                }
                if(arr[indx]==target){
                    ans.add(indx);   
                }
                ArrayList<Integer> smallAns= allindx(arr, target, n, indx+1);
                ans.addAll(smallAns);
                return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,2,5,2};
        int target=2;
        int n=arr.length;
        ArrayList<Integer> ans=allindx(arr, target, n, 0);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
    
}
