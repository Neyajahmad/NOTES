import java.util.*;

public class TrappingRain {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] height = {1, 2, 1, 3, 2, 1};
        int n = height.length;

        int left_max[] = new int[n];
        int right_max[] = new int[n];

        left_max[0] = height[0]; 
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], height[i - 1]);
        }

        right_max[n - 1] = height[n-1]; 
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], height[i + 1]);
        }

        System.out.println("Left max is:");
        print(left_max);

        System.out.println("Right max is:");
        print(right_max);


        int sum = 0;
        for (int i = 0; i < n; i++) {
            int trapped = Math.min(left_max[i], right_max[i]) - height[i];
            if (trapped > 0) {
                sum += trapped;
            }
        }

        System.out.println("Total water trapped: " + sum);
    }
}
