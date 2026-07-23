import java.util.*;
public class MaximumElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        // insert element into the array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        
/*
    //Print the array elements

      System.out.println("Arrays are :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

*/  

int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
        max=arr[i];
    }
}
System.out.println("Maximum element is "+max);
    }
}