import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3,4,53,4,4,12,4,3,4,13,4};
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(var a:arr){
            if(!mp.containsKey(a)){
                mp.put(a, 1);
            }
            else{
                mp.put(a, mp.get(a)+1);
            }
        }

        System.out.println(mp.entrySet());

        int maxfreq=0 , anskey=-1;


        //Method 1

        // for(var e:mp.entrySet()){
        //     if (e.getValue()>maxfreq) {
        //         maxfreq=e.getValue();
        //         anskey=e.getKey();
                
        //     }
        // }
        // System.out.printf("%d key have %d frequency",anskey , maxfreq);

        //Method 2

        for(var key: mp.keySet()){
            if(mp.get(key)>maxfreq){
                maxfreq=mp.get(key);
                anskey=key;
            }
        }

        System.out.printf("%d key have %d frequency",anskey , maxfreq);
    }
    
}
