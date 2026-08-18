import java.util.*;
public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Arrays element are :");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
            }

            else if(arr[i]<secondSmall && arr[i]!=small){
                secondSmall=arr[i];
            }
        }

        System.out.print("Second Smallest number is "+ secondSmall);
    }
    
}
