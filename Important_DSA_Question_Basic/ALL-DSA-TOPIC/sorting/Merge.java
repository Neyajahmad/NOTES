package sorting;
import java.util.ArrayList;

public class Merge{

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = low;
        int j = mid + 1;

        // Merge two sorted subarrays
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans.add(arr[i++]);
            } else {
                ans.add(arr[j++]);
            }
        }

        // Copy remaining elements of left subarray
        while (i <= mid) {
            ans.add(arr[i++]);
        }

        // Copy remaining elements of right subarray
        while (j <= high) {
            ans.add(arr[j++]);
        }

        // Copy sorted elements back to the original array
        for (int k = 0; k < ans.size(); k++) {
            arr[low + k] = ans.get(k);
        }
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            // Sort left half
            sort(arr, low, mid);

            // Sort right half
            sort(arr, mid + 1, high);

            // Merge sorted halves
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 6, 2, 4};
        int low = 0;
        int high = arr.length - 1;

        // Perform merge sort
        sort(arr, low, high);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
