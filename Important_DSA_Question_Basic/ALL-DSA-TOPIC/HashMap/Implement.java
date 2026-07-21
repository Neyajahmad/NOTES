// 2.56

import java.util.*;

public class Implement{
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; // number of entries in the map
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked") 
        private void initBuckets(int N) {
            buckets = (LinkedList<Node>[]) new LinkedList[N]; // Unchecked cast warning suppressed
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        // Traverse the linked list and look for a node with key.
        // If found, return its index; otherwise, return -1.
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Fixed incorrect comparison
                    return i;
                }
            }
            return -1;
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length;
        }

        public int size() {
            return n;
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets=buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for(var bucket: oldBuckets){
                for(var node:bucket){
                    put(node.key,node.value);
                }
            }
        }


        public void put(K key, V value) { // insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei == -1) { // Key doesn't exist, insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else { // Update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            //Re-hashing
            // 3>= 4 * 0.75.
            if(n>= buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei != -1) { // Key exists
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            return null; // Key doesn't exist
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei != -1) { // Key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            return null; // Key doesn't exist
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        System.out.println("Capacity: "+ mp.capacity());
        System.out.println("Load: "+ mp.load());
        mp.put("c", 3);
        mp.put("x", 90);
        System.out.println("Testing size: " + mp.size());

        //Testing get
        System.out.println(mp.get("a")); //1
        System.out.println(mp.get("b")); // 2
        System.out.println(mp.get("c")); //3
        System.out.println(mp.get("x")); // 90
        System.out.println(mp.get("collage")); // null


        // remove
        System.out.println(mp.remove("c"));// 3
        System.out.println(mp.remove("c"));
        System.out.println("Testing size: " + mp.size());

        System.out.println("Capacity: "+ mp.capacity());
        System.out.println("Load: "+ mp.load());


    }
}
