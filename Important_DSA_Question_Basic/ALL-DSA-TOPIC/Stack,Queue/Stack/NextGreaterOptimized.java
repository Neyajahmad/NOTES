import java.util.Stack;

public class NextGreaterOptimized {
    public static void nextGreater(int arr[]) {
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
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
