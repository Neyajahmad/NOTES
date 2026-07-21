import java.util.HashMap;
import java.util.Map;


public class freqs{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,1,2,5,6,2,3,2,1};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxFrequency = 0;
        int mostFrequentNumber = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        }

        System.out.println("The number with the maximum frequency is: " + mostFrequentNumber);
        System.out.println("Its frequency is: " + maxFrequency);

    }
}