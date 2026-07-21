public class Smallestonleft {
    public static void smallest(int arr[]){
        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    ans[i] = arr[j];
                    break; 
                    
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 4, 3};
        smallest(arr);
    }
}
