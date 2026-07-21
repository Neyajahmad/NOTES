public class MergeSort {
    // 
    
    public static void merge(int arr[], int low, int mid, int high) {
        int ans[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= high) {
            ans[k++] = arr[j++];
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = ans[k];
        }
    }

    public static void mergeSort(int arr[], int l, int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l,mid, r);
    }



    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int n=arr.length;

        System.out.println("Before sorting");
        display(arr);
        System.out.println();

        System.out.println("After sorting");
        mergeSort(arr, 0, n-1);
        display(arr);
        
        
    }
    
}
