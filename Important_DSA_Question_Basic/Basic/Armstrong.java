import java.util.*;


public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int number1=number;
        int pow=0;
        int sum=0;
        while (number1>0) {
            pow++;
            number1=number1/10;
        }
        // System.out.println(pow);
        number1=number;

        while (number1>0) {
            int rem=number1%10;
            sum+=Math.pow(rem,pow);
            number1=number1/10;
        }

        // System.out.println(sum);

        if(sum==number){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}