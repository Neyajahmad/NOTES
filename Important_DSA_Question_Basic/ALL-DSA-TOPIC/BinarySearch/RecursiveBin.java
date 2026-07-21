public class RecursiveBin {

    public static boolean binarySearch(int arr[],int target,int low,int high){
       
        if(low>high) return false;
        int mid=low+(high-low)/2;
        if(target==arr[mid]) return true;
        else if(target>arr[mid]) return binarySearch(arr,target,mid+1,high);
        else return binarySearch(arr,target,low,mid-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=13;
        int low=0;
        int high=arr.length-1;
        System.out.println( binarySearch(arr,target,low,high));
       
    }
    
}
