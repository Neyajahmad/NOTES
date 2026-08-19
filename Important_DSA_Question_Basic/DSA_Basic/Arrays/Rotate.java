/*
arr[]={1,2,3,4,5,6}
1,2,3,4,5,6 -->0 --> 6,5,4,3,2,1 -->6,1,2,3,4,5 -->1
5,6,1,2,3,4 -->2
4,5,6,1,2,3 -->3  4,5,6,1,2,3
3,4,5,6,1,2 -->4
2,3,4,5,6,1 -->5
1,2,3,4,5,6 -->6

k=4
k= k%n

k = 10 % 6
k = 4 :- only rotate the array 4 times.
*/
import java.util.*;
public class Rotate {
    public static void reverse(int arr[], int start , int end){
       while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the position you want to rotate the array : ");
        int k=sc.nextInt();
        k = k % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println("After rotating the error : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
    
}
