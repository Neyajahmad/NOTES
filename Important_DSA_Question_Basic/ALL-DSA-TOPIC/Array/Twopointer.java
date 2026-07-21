// array the element in increasing order , 
//element should be negative and ypu have to print element by squaring them.

import java.util.*;
public class Twopointer {
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        int ans[]=new int[arr.length];
        int i=0;
        int j=arr.length-1;
        int k=arr.length-1;
        while(i<=j){
            if(Math.abs(arr[j])<Math.abs(arr[i])){
               ans[k--]=arr[i]*arr[i];
               i++;
            }
            else{
                ans[k--]=arr[j]*arr[j];
                j--;
            }
        }

        for(int q=0;q<arr.length;q++){
          System.out.print(ans[q]+" ");
        }
        
    }
    
}
