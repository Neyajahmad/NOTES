// Recurssion on array..
public class array {

    public static void print(int arr[],int indx){
        int n=arr.length;
            if(indx==n){
                return;
            }
           System.out.println(arr[indx]); 
           print(arr, indx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        print(arr, 0);        
    }
    
}
