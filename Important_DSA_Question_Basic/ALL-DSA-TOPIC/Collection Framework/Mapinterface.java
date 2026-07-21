import java.util.*;
public class Mapinterface {
    public static void main(String[] args) {
        Map<Integer, String> mp= new HashMap<>();
        // HashMap<Integer, String> mp1= new HashMap<>();
        mp.put(1, "neyaj");
        mp.put(2, "ahmad");
        mp.put(3, "sohaib");
        mp.put(3, "akram"); // overrides..
        mp.putIfAbsent(3, "akram"); // overrides..

        // itrating over keys in a map..
        // for(Integer i:mp.keySet()){
        //     System.out.println(i);
        // }

        // for(String i:mp.values()){
        //     System.out.println(i);
        // }

        // for(var i:mp.values()){
        //     System.out.println(i);
        // }

        //traversing over the key, values mapping..
        for(var e:mp.entrySet()){
            System.out.println(e.getKey());
        }






        // System.out.println(mp);
        // System.out.println(mp.get(1));
        // System.out.println(mp.containsKey(1));
        // System.out.println(mp.containsValue("sohaib"));
        // System.out.println(mp.entrySet());
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());

    }
    
}
