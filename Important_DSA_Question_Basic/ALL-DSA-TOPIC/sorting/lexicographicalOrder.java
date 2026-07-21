// lexicographicalOrder means dictonary order.
// collage < cot <cottage --> Actual question. // use selectionsort.
// 1<10<100<2<20

import java.util.*;
public class lexicographicalOrder {

    public static void lexi(String arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[small])<0){
                    small=j;
                }
            }
            //swap
            String temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        String arr[]={"kiwi","apple","papaya"};
        lexi(arr);
        for(String val:arr){
            System.out.print(val+" ");
        }
    }
}