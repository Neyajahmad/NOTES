import java.util.*;
public class maxarray {

    public static int max(int arr[],int indx){
        int n=arr.length;
        if(indx==n-1){
            return arr[indx];
        }
        int large=max(arr,indx+1);
        return Math.max(arr[indx], large);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,45,5};
        int indx=0;
        System.out.println(max(arr, indx));
    }
    
}
