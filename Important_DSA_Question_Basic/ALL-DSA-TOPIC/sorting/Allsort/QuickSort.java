public class QuickSort {

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[start]; // Choose pivot
        int count = 0;
        
        // Count elements <= pivot
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) count++;
        }

        // Placing pivot at correct position
        int pivotIdx = start + count;
        swap(arr, start, pivotIdx);

        int i = start, j = end;

        // Arranging elements around pivot
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) return;

        int pi = partition(arr, start, end);

        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 2, 1};
        int n = arr.length;

        System.out.println("Before sorting:");
        display(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("After sorting:");
        display(arr);
    }
}
