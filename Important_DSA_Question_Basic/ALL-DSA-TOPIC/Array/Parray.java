public class Parray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans[]=new int[arr.length];
        int pre=1;
        for(int i=0;i<arr.length;i++){
            ans[i]=pre*arr[i];
            pre*=arr[i];
        }
    }
    
}
