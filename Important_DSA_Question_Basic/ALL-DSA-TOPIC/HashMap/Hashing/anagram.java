import java.util.*;

public class anagram {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();

        Map<Character, Integer> MP1 = new HashMap<>();
        Map<Character, Integer> MP2 = new HashMap<>();

        for (int i=0;i<aArr.length;i++){
            char key=aArr[i];
            MP1.put(key, MP1.getOrDefault(key, 0) + 1);
        }

        for (int i=0;i<bArr.length;i++) {
            char key=bArr[i];
            MP2.put(key, MP2.getOrDefault(key, 0) + 1);
        }

        return MP1.equals(MP2);
    }

    public static void main(String[] args) {
        String a = "abcde";
        String b = "dcab";

        if (isAnagram(a, b)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
