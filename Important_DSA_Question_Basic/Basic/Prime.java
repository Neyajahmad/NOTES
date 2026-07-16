import java.util.Scanner;

public class Prime{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<2) System.out.println("Number is not prime");
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) System.out.println("not prime"); 
            return;
        }

        System.out.println("prime number");
    }
}