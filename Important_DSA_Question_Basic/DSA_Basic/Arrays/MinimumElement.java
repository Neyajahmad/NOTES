import java.util.Scanner;

public class MinimumElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int small=Integer.MAX_VALUE;
        System.out.print("Enter the array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Arrays elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println();
        System.out.println("Minimum element from the array is: "+ small);
    }
}