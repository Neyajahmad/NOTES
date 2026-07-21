public class InsertionSort {

    public static void Insertion(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                //swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3};
        Insertion(arr);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
