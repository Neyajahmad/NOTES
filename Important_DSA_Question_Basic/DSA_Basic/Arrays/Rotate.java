/*
arr[]={1,2,3,4,5,6}
1,2,3,4,5,6 -->0 --> 6,5,4,3,2,1 -->6,1,2,3,4,5 -->1
5,6,1,2,3,4 -->2
4,5,6,1,2,3 -->3
3,4,5,6,1,2 -->4
2,3,4,5,6,1 -->5
1,2,3,4,5,6 -->6

k=4
k= k%n
*/
import java.util.*;
public class Rotate {

    public void reverse(int arr[], int k){
        for(int i=0,j=arr.length-1;i<=j;i++){

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

        reverse(arr, k);


    }
    
}
