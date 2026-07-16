import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int answer=(int)Math.sqrt(num);
        if(answer*answer==num){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a Perfect square");
        }
    }
}
