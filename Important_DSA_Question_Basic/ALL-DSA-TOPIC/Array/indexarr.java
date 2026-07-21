// find index of number in the array

import java.util.*;
public class indexarr {

    public static void index(int target,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Index of the array is : "+i);
                return;
            }
        }
        System.out.println("This element is not present");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array. ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        index(5,arr);
    }
}
