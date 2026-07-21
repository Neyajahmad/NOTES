public class RemoveDup {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        int rd=0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        System.out.println("unique number in array is: "+(rd+1));
    }
    
}
