import java.util.Stack;

public class Nextsmaller {
    public static void smallest(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 4, 3};
        smallest(arr);
    }
}