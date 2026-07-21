import java.util.*;

public class AreaRectangle {

    static void leftsmall(int heights[]) {
        int ans[] = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = heights[stack.peek()];
            }
            stack.push(i);
        }

        System.out.print("Smaller Left: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static void rightsmaller(int heights[]) {
        int ans[] = new int[heights.length];
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = heights[stack.peek()];
            }
            stack.push(i);
        }

        System.out.print("Smaller Right: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 4, 6, 5, 4, 2, 1};
        leftsmall(arr);
        System.out.println();
        rightsmaller(arr);

        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int width=smallestRight[i]-smallesleft[i]-1;
            int current_area=width*arr[i];
            max_Area=MAX(max_Area,current_area)
        }
    }
}
