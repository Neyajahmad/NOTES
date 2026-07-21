// return 1st repeat element from the given array.

public class repeat {
    public static void main(String[] args) {
        int arr[]={12,8,3,4,10,5,6,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    } 
}
