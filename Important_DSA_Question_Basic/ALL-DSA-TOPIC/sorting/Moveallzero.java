package sorting;
// inp: 0 5 0 3 42
// out: 5 3 42 0 0
public class Moveallzero {
public static void moveZero(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        boolean check=true;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]==0 && arr[j+1]!=0){
                //swap 
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                check=false;
            }
        }
        if(check){
            return;
        }
    }
}
    public static void main(String[] args) {
        int arr[]={0,5,0,3,42};
        moveZero(arr);
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
    
}
