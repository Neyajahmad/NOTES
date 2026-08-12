import java.util.Scanner;

public class SecondLargestElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("All element are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int Largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                SecondLargest=Largest;
                Largest=arr[i];
            }
            else if(arr[i]>SecondLargest && Largest!=arr[i]){
                SecondLargest=arr[i];
            }
        }

        System.out.println("The second largest element is: "+SecondLargest);
    }
}