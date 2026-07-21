// copy of array 3 method

import java.util.*;
public class copyarr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]=arr1.clone();

        int arr3[]=Arrays.copyOf(arr1,4);
        int arr4[]=Arrays.copyOfRange(arr1,0,3);

        System.out.println("Array 2 is: ");
        arr2[0]=6;
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println("Array 1 is: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        
        System.out.println("Array 3 is: ");
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }
    
}
