// find out maximum number in the table :-- one bag is given inside their different number is present and duplicate number also be their
// you have to pick 1 element and put the element on the table if this number is already present remove the number from the table.
// finally return the max element present on the table at particular time. 

import java.util.*;
public class Table {
    public static int maxNumbersOnTable(int bag[]){
        HashSet<Integer> table=new HashSet<>();
        int max=0;
        for(int i=0;i<bag.length;i++){
            int num=bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                max=Math.max(max,table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={2,1,1,3,2,3};
        System.out.println(maxNumbersOnTable(nums));
    }
    
}
