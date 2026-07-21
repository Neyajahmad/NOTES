public class NextGreaters{
    public static void nextGreater(int arr[]) {
        int ans[] = new int[arr.length];

       
        for (int i = 0; i < arr.length; i++) {
            ans[i] = -1; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    ans[i] = arr[j];
                    break; 
                }
            }
        }

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + ans[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 7, 9, 0, 6};
        nextGreater(arr);
    }
}
