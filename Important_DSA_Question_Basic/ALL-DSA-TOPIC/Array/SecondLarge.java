// find second larger number from the given array.
import java.util.*;
public class SecondLarge{

    public static int largeElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                    max=arr[i];
              }
        }
        return max;
    }

    public static int secondlarge(int arr[]){
        int max=largeElement(arr);
        for(int i=0;i<arr.length;i++){
           if(arr[i]==max){
               arr[i]=Integer.MIN_VALUE;
           }
        }
   
        int secondlarge=largeElement(arr);
         return secondlarge;
    }
    public static void main(String[] args) {
        int arr[]={2,3,487,65,486};
        // System.out.println(secondlarge(arr));


        // sorting method...

        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(max!=arr[i] && sec<arr[i]){
                 sec=arr[i];
            }
        }
      



    //     int max=arr[0];
    //     int secmax=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(max<arr[i]){
    //             secmax=max;
    //             max=arr[i];
    //         }
    //         else if(arr[i]!=max && arr[i]>secmax){
    //             secmax=arr[i];

    //         }

    //     }

        System.out.println("Second largest number is "+sec);
       



    }
    
}