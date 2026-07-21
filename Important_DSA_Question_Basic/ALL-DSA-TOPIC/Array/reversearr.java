// reverse array 2 method.  

public class reversearr {

  public static void reverse(int arr[]){
    for(int i=0,j=arr.length-1;i<j;i++,j--){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
  }
    public static void main(String[] args) {
        int arr[]={7,5,3,2,6};
      //   int len=arr.length;
      //   int rev[]=new int[len];
      //   for(int i=len-1,j=0;i>=0;i--,j++){
      //      rev[j]=arr[i];
      //   }
      //  System.out.print("Reverse array is: ");
        reverse(arr);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }
    
}
