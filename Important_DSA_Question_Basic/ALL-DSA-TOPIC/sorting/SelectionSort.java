package sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,2,5,1,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minimum=i;
            for(int j=i+1;j<n;j++){
                if(arr[minimum]>arr[j]){
                     minimum=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minimum];
            arr[minimum]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
