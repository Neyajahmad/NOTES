public class SelectionSort {

    public static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }   
    }
    public static void main(String[] args) {
      int arr[]={6,4,3,7,50};
      selection(arr);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    
}
