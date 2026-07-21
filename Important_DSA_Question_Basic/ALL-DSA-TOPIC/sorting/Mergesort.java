package sorting;
public class Mergesort {

    public static void merge(int arr[], int low, int mid, int high) {
        int ans[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= high) {
            ans[k++] = arr[j++];
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = ans[k];
        }
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 6, 2, 4};
        int low = 0;
        int high = arr.length - 1;

        sort(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
