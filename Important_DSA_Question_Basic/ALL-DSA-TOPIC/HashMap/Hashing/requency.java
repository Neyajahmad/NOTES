public class requency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 2, 5};
        
        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            int freq = 1;
            
            // Check if the element is already counted
            boolean isCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    isCounted = true;
                    break;
                }
            }
            
            // If the element has not been counted yet
            if (!isCounted) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        freq++;
                    }
                }
                System.out.println("Frequency of " + arr[i] + " is " + freq);
            }
        }
    }
}
