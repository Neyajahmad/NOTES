// rotate the array k time 
public class Rotatek {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        int n=arr.length;
        int j=0;
        int ans[]=new int[n];
        for(int i=n-k;i<n;i++){
           ans[j++]=arr[i];
        }

        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
