import java.util.*;


public class Knapsack{
    private static class Item {
        Integer value;
        Integer weight;

        public String toString(){ // bydefault this function is written but when we make manually class for item than we have to write this.
            return (value+" "+weight);
        }
    }
    private static class ItemComparator implements Comparator<Item>{   
        public int compare(Item i1, Item i2){ // override the compare function.
            if((i1.value/i1.weight)<(i2.value)/(i2.weight)){
                return 1;
            }
            else if((i1.value/i1.weight)>(i2.value)/(i2.weight)){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> value=List.of(60,100,150,120);
        List<Integer> weights=List.of(10,20,50,15);
        List<Item> itemList=new ArrayList<>();
        for(int i=0;i<value.size();i++){
            Item a=new Item();
            a.value=value.get(i);
            a.weight=weights.get(i);
            itemList.add(a);
        }
        itemList.sort(new ItemComparator());
        System.out.println(itemList);
        int w=30;
        int profit=0; 
        while (w>0) {
            for(int i=0;i<itemList.size();i++){
                Item item=itemList.get(i);
                if(item.weight<=w){
                    profit+=item.value;
                    w-=item.weight;
                }
                else{
                    profit+=(item.value)/item.weight*w;
                    w=0;
                }
            }
            
        }
        System.out.println(profit);

    }
}



// Time complexity:--O(NlogN).