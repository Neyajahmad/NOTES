public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        int low=0;
        int high=arr.length-1;
        int target=8;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("Element present in index :"+mid);
            }
            if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    }    
}
