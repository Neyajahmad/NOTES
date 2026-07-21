// last index of a particular element.

public class LastOcc {
    public static void main(String[] args) {
    int arr[]={1,2,3,2,4};
    int last=-1;
    int target=2;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            last=i;
        }
  }
  System.out.println(last);
        
    }
    
}
