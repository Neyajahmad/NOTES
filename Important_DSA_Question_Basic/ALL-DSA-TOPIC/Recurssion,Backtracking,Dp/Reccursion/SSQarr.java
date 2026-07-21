public class SSQarr {
    public static void SSQ(int arr[],int sum,int indx,int n){
        if(indx>=n){
            System.out.println(sum);
            return;
        }

        SSQ(arr, sum+arr[indx], indx+1, n); // include
        SSQ(arr, sum, indx+1, n); // exclude
    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        int sum=0;
        SSQ(arr,sum,0,arr.length);
    }
    
}
