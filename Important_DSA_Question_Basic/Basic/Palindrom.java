import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int temp=num;
        int reverse=0;
        while(temp>0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }

        if(reverse==num) System.out.println("Number is palindrom");
        else System.out.println("Number is not a Palindrom");
    }
}
