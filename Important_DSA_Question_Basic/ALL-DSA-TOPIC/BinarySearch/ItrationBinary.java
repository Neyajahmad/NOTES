public class ItrationBinary {

    public static void binarySearch(int arr[],int target,int low, int high){
        while (low<=high) {
            int mid=low+(high-low)/2;
            if (target==arr[mid]) {
                System.out.println("Target is present in index "+mid);
                return;
            }

            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=7;
        int low=0;
        int high=arr.length-1;
        binarySearch(arr,target,low,high);
    }
}