// max sub array sum of size K.

public class Kmaxsub {
    public static void main(String[] args) {
        int arr[]={1,5,-9,10,4,13};
        int n=arr.length;
        int k=4;
        int max = Integer.MIN_VALUE;
       
        for(int i=0;i<=n-k;i++){   
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(max<sum){
            max=sum;
        }
    }
    System.out.println(max);
    }
  
    
}
