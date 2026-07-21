public class BubbleSort {

    public static void Bubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean check=false; // optimize
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    check=true;
                }
            }
            if (check==false) {
                return;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,5,100,6,2};
        Bubble(arr);
        print(arr);
    }
}