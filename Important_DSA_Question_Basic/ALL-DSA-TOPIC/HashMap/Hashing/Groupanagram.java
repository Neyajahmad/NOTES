import java.util.*;

public class Groupanagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        
        // Printing the grouped anagrams
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // HashMap to store sorted strings as keys and lists of anagrams as values
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert the string to a character array, sort it, and convert it back to a string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            // Add the original string to the correct group in the map
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(s);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
}
