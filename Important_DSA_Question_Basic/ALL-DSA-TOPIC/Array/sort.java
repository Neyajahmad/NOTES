// check given array is sorted or not.

import java.util.*;
public class sort {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check=false;
                break;
            }
        }
        System.out.println(check);

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
