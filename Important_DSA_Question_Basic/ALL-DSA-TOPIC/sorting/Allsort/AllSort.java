public class AllSort {

    public static void Bubble(int arr[]){
       int n=arr.length;
       for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }

    public static void Selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if (arr[small]>arr[j]) {
                    small=j;
                }
            }
            //swap
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3};
        Bubble(arr);
        System.out.println();
        Selection(arr);
    }
    
}
