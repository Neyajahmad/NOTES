import java.util.HashMap;
import java.util.Map;

public class freqfor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 1, 3, 3, 4};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

  
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int frequency;
            if (frequencyMap.containsKey(num)) {
                frequency = frequencyMap.get(num);
            } else {
                frequency = 0;
            }
            frequencyMap.put(num, frequency + 1);
        }

        System.out.println("Frequencies of numbers:");
        
        Object[] entries = frequencyMap.entrySet().toArray();
        for (int i = 0; i < entries.length; i++) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) entries[i];
            System.out.println("Number " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
