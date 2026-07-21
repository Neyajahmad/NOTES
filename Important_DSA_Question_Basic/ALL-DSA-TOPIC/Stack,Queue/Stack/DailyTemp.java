// Return index of next greater number.
import java.util.Stack;

public class DailyTemp {
  public static void indexNextgreater(int arr[]){
    int n=arr.length;
    int result[]=new int[n];
    Stack<Integer> ans=new Stack<>();

    for(int i=0;i<n;i++){
        while(!ans.isEmpty() && arr[i]>arr[ans.peek()]){
            int previndx=ans.pop();
            result[previndx]=i-previndx;
        }
        ans.push(i);
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+"->"+result[i]);
    }
  }
    public static void main(String[] args) {
        int arr[]={2,4,5,0,1,7};
        indexNextgreater(arr);
    }
}
