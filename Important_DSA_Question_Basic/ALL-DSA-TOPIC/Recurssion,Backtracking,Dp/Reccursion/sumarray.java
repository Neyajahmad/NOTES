public class sumarray {

    public static int sum(int arr[],int indx){
        if(indx==arr.length){
            return 0;
        }
       int sum=0;
       sum+=sum(arr,indx+1);
       return arr[indx]+sum;
    }
    public static void main(String[] args) {
        int arr[]={1};
        System.out.println(sum(arr, 0));
        
    }
    
}
