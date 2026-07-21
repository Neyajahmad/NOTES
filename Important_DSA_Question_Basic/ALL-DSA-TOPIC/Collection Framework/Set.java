//  set interface :--->Hashset (classes) , LinkedHashset (classes) :---> sorted set(sub interface) :->Treeset(classes).
// set :--> no duplicate element is present..

// hashset :--> // unordered , uniqueue. , printing order is random :-- use hashing concept.
// linkedhashset :--> jis order mai element insert hoga wusi order mai element mil jaye ga. ; liskedlist+hashtable.
// Treeset :-- print in increasing order. ; use self balancing binary search tree.
 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        // HashSet<Integer> st=new HashSet<>();
        // LinkedHashSet<Integer> st=new LinkedHashSet<>();
        TreeSet<Integer> st=new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(1);
        st.add(1);
        st.add(48);
        st.add(54);
        st.add(3);
        st.add(100);
        System.out.println(st); 
        // System.out.println(st); // 1 2 3
        // st.remove(2);
        // System.out.println(st.contains(2)); // false
        // System.out.println(st.size()); //2

    }
    
}
