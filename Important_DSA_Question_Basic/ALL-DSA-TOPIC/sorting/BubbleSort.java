package sorting;
import java.util.*;
public class BubbleSort{
    public static void main(String[] args) {
        int arr[]={8,3,9,2,4,3};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;i<n-i-1;i++){
                if(arr[j]>arr[j+1]){
                    // Collection.swap(arr[j],arr[j+1]);
                }
            }
        }
    }
}