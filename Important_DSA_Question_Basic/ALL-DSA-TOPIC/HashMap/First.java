import java.util.*;

public class First{
    public static void main(String[] args) {
        Map<String, Integer> mp=new HashMap<>();
        // Addding Element 
        mp.put("Neyaj", 1);
        mp.put("Ahmad", 2);
        mp.put("Akram", 3);
        mp.put("Shammi", 4);
        mp.put("Rahul", 5);

        //Getting value of a key from the HashMap
        System.out.println(mp.get("Neyaj")); // 1
        System.out.println(mp.get("Rahul")); // 5

        // changing / updating value of a key in the HashMap
        mp.put("Neyaj", 12); // Neyaj -> 12
        System.out.println(mp.get("Neyaj")); // 12

        //Removing a pair from the HashMap
      System.out.println(mp.remove("Neyaj"));  //12
      System.out.println(mp.remove("rohit"));  // null

      // checking if a key is in the hashmap
      System.out.println(mp.containsKey("Ahmad")); // true
      System.out.println(mp.containsKey("aditya")); // false

      //Adding a new entry only if the new key doesn't exist already..
      mp.putIfAbsent("Neyaj", 100) ;// will not enter
      mp.putIfAbsent("yash", 500); // will enter

      // Get all keys in the Hashmap
      System.out.println(mp.keySet());

      // Get all values in the HashMap
      System.out.println(mp.values());

      //Get all entries in the Hashmap
      System.out.println(mp.entrySet());

      //Traversing all entries of hashmap - multiple methods
      for(var key:mp.keySet()){
        System.out.printf("Age of %s is %d\n", key, mp.get(key));
      }

      for(Map.Entry<String, Integer> e:mp.entrySet()){
        System.out.printf("Age of %s is %d\n" , e.getKey(), e.getValue());
      }

    }
}