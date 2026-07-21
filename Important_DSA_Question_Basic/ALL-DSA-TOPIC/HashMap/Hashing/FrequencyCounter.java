import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 1, 3, 3, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

       for (int num : numbers) {
            int frequency;
            if (frequencyMap.containsKey(num)) {
                frequency = frequencyMap.get(num);
            } else {
                
                frequency = 0;
            }
            frequencyMap.put(num, frequency + 1);
        }

        System.out.println("Frequencies of numbers:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
